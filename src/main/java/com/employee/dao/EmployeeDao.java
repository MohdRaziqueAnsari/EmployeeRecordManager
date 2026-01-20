package com.employee.dao;

import com.employee.model.Employee;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class EmployeeDao {

    public void save(Employee emp) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.save(emp);
            tx.commit();
        }
    }

    public Employee login(String loginId, String password) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Employee> q = session.createQuery(
                "from Employee where loginId=:lid and password=:pwd",
                Employee.class
            );
            q.setParameter("lid", loginId);
            q.setParameter("pwd", password);
            return q.uniqueResult();
        }
    }

    public List<Employee> getAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Employee", Employee.class).list();
        }
    }
}
