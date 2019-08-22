package com.example.springbootcassandra.service;

import com.example.springbootcassandra.model.Employee;
import com.example.springbootcassandra.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public void addEmployees(List<Employee> employees) {
        employeeRepository.saveAll(employees);
    }

    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public Employee getEmployee(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

    public Employee updateEmployee(int id, Employee employee) {
        employee.setId(id);
        return employeeRepository.save(employee);
    }

    public List<Employee> getEmployeeFindByLessThanAge(int age) {
        return employeeRepository.findByAgeLessThan(age);
    }
}
