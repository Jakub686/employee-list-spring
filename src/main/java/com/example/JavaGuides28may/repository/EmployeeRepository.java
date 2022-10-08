package com.example.JavaGuides28may.repository;
import com.example.JavaGuides28may.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}