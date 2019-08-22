package com.example.springbootcassandra.repository;

import com.example.springbootcassandra.model.Employee;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.List;

public interface EmployeeRepository extends CassandraRepository<Employee, Integer> {

    @AllowFiltering
    List<Employee> findByAgeLessThan(int age);
}
