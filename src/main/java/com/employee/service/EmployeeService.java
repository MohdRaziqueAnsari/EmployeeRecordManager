package com.employee.service;

import com.employee.dao.EmployeeDao;
import com.employee.model.Employee;

import java.util.List;

public class EmployeeService {

    EmployeeDao dao = new EmployeeDao();

    public void register(Employee emp) {
        dao.save(emp);
    }

    public Employee login(String loginId, String password) {
        return dao.login(loginId, password);
    }

    public List<Employee> listAll() {
        return dao.getAll();
    }
}
