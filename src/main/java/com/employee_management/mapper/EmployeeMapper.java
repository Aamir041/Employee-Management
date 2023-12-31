package com.employee_management.mapper;

import com.employee_management.Role;
import com.employee_management.dto.EmployeeDto;
import com.employee_management.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee){

        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail(),
                employee.getSalary(),
                employee.getRole().getResponse()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto) throws IllegalArgumentException{
        Role role;
        try{
            role = Role.valueOf(employeeDto.getRole().toUpperCase());

        }
        catch (IllegalArgumentException exception){
            throw new RuntimeException("Num Illegal");
        }
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail(),
                employeeDto.getSalary(),
                role
        );
    }

}
