# Employee Management System (Spring + Hibernate)
A simple Employee Management Web Application built using **Java, Spring, Hibernate, JSP, MySQL, and Tomcat**. This project demonstrates basic CRUD operations along with **Employee Registration, Login, and Welcome page** functionality.


🚀 **Features**
● Employee Registration
● Employee Login Authentication
● Welcome Page with Logged-in Employee Name
● MVC Architecture (Controller, Service, DAO)
● Hibernate ORM for database operations
● Spring for dependency injection


🛠️ **Technologies Used**
● Java 11
● Spring Framework
● Hibernate
● JSP & JSTL
● MySQL
● Apache Tomcat
● Maven
● Eclipse


📂 **Project Structure**

EmployeeManagementSystem
│
├── src/main/java
│   ├── model        (Employee entity)
│   ├── dao          (EmployeeDao),(HibernateUtil)
│   ├── service      (EmployeeService)
│   ├── controller   (Spring Controllers)      
│
├── src/main/webapp
│   ├── register.jsp
│   ├── login.jsp
│   └── welcome.jsp
│
├── hibernate.cfg.xml
├── spring-servlet.xml
├── pom.xml
└── README.md


🧑‍💻 **Employee Registration Fields**
● Name
● Date of Birth
● Gender
● Address
● City
● State
● Login ID
● Password


⚙️ **Database Configuration**
1. Create a MySQL database:
   sql
   CREATE DATABASE employee_db;
2. Update **hibernate.cfg.xml** with your database credentials:
   xml
<property name="hibernate.connection.url">jdbc:mysql://localhost:3306/employee_db</property>
<property name="hibernate.connection.username">root</property>
<property name="hibernate.connection.password">your_password</property>


▶️ **How to Run the Project**
Follow these steps exactly as done in Eclipse:

1. Open the project in Eclipse IDE
2. Go to Window → Show View → Other…
3. Select Server → Servers and click Open
4. In the Servers tab 'Click this link to create a new server' (or right-click → New → Server)
5. Choose Apache → Tomcat and select the required Tomcat version
6. Click Next and configure the Tomcat installation directory
7. On the Add and Remove screen:
   ● Select your project
   ● Click Add
   ● Click Finish
8. Now, in the Servers tab:
   ● Right-click on the Tomcat server
   ● Click Start (or Run)
9. Once the server starts successfully, open your browser and visit:
   http://localhost:8080/EmployeeManagementSystem


📸 **Screens Included**
● Employee Registration Page
● Login Page
● Welcome Page


📌 **Learning Outcomes**
● Spring MVC flow
● Hibernate ORM usage
● JSP form handling
● MySQL database integration
● Maven project structure


👤 **Author**
Mohd Razique
B.Tech Student



⭐ If you like this project, don’t forget to star the repository!

