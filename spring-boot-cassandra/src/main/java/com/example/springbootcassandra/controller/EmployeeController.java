package com.example.springbootcassandra.controller;

import com.example.springbootcassandra.model.Employee;
import com.example.springbootcassandra.service.EmployeeService;
import com.sun.tracing.dtrace.ProviderAttributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostConstruct
    public void addEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101, "Ram", 26, "Developer", "Pune"));
        employeeList.add(new Employee(102, "Shyam", 46, "QA", "Mumbai"));
        employeeList.add(new Employee(103, "Arun", 25, "Admin", "Delhi"));
        employeeList.add(new Employee(104, "Jay", 23, "Sales", "Thane"));
        employeeList.add(new Employee(105, "Charan", 55, "Sales", "Solapur"));

        employeeService.addEmployees(employeeList);
    }

    @GetMapping("employees")
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @GetMapping("employee/{id}")
    public Employee getEmployee(@PathVariable int id) {
        return employeeService.getEmployee(id);
    }

    @PostMapping("employee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @DeleteMapping("employee/{id}")
    public int deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
        return id;
    }

    @PutMapping("employee/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
        return employeeService.updateEmployee(id, employee);
    }

    @GetMapping("employees/lessThanAge/{age}")
    public List<Employee> getEmployeeFindByLessThanAge(@PathVariable int age) {
        return employeeService.getEmployeeFindByLessThanAge(age);
    }
}
