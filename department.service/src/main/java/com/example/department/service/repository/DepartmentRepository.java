package com.example.department.service.repository;

import com.example.department.service.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Department findDepartmentById(Long id);
}
