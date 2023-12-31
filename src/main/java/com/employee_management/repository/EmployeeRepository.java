package com.employee_management.repository;

import com.employee_management.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * SimpleJpaRepository implements JpaRepository
 * which has all the basic crud features implemented
 * SimpleJpaRepository is already implemented with @Repository annotation
 * therefore no need use that annotation
 * */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
