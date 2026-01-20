package com.employee.controller;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /* ============================
       1️⃣ SHOW REGISTRATION PAGE
       ============================ */
    @GetMapping("/register")
    public String showRegisterPage() {
        return "register";
    }

    /* ============================
       2️⃣ HANDLE REGISTRATION
       ============================ */
    @PostMapping("/register")
    public String registerEmployee(@ModelAttribute Employee employee) {
        employeeService.register(employee);   // ✔ matches service
        return "redirect:/login";
    }

    /* ============================
       3️⃣ SHOW LOGIN PAGE
       ============================ */
    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    /* ============================
       4️⃣ HANDLE LOGIN
       ============================ */
    @PostMapping("/login")
    public String loginEmployee(@RequestParam("loginId") String loginId,
                                @RequestParam("password") String password,
                                HttpSession session,
                                Model model) {

        Employee employee = employeeService.login(loginId, password); // ✔ matches service

        if (employee != null) {
            session.setAttribute("loggedUser", employee);
            return "redirect:/welcome";
        } else {
            model.addAttribute("error", "Invalid Login Credentials");
            return "login";
        }
    }

    /* ============================
       5️⃣ WELCOME PAGE (LIST USERS)
       ============================ */
    @GetMapping("/welcome")
    public String welcomePage(HttpSession session, Model model) {

        Employee loggedUser = (Employee) session.getAttribute("loggedUser");

        if (loggedUser == null) {
            return "redirect:/login";
        }

        List<Employee> employees = employeeService.listAll(); // ✔ matches service

        model.addAttribute("user", loggedUser);
        model.addAttribute("employees", employees);

        return "welcome";
    }

    /* ============================
       6️⃣ LOGOUT
       ============================ */
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}
