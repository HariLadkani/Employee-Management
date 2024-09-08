package com.luv2code.demo.rest;

import com.luv2code.demo.dao.EmployeeDAO;
import com.luv2code.demo.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    //expose "/employee" end point
    private EmployeeDAO employeeDAO;

    public EmployeeRestController(EmployeeDAO theEmployeeDAO) {
        employeeDAO = theEmployeeDAO;
    }

    @GetMapping("/employees")
    public List<Employee> finalAll() {
        return employeeDAO.finalAll();
    }



}
