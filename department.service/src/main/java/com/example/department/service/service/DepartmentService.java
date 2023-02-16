package com.example.department.service.service;

import com.example.department.service.entity.Department;
import com.example.department.service.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class DepartmentService {
    private final DepartmentRepository departmentRepository;
    public Department saveDepartment(Department department) {
        log.info("inside saveDepartment of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department getDepartmentById(Long id) {
        log.info("inside findDepartmentById of DepartmentService");
        return departmentRepository.findDepartmentById(id);
    }
}
