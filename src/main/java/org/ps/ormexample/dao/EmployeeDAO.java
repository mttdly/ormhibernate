package org.ps.ormexample.dao;

import java.util.List;

import org.ps.ormexample.models.Employee;

public interface EmployeeDAO {
        // crud create, read, update, delete
        
        int createEmployee(Employee employee);
        List<Employee> getAllEmployees();
        int updateEmployee(Employee employee);
        int deleteEmployee(int empID);
}