package com.rameshsoft.ems.repository;

import com.rameshsoft.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {//type of entity,type of primary key
}
