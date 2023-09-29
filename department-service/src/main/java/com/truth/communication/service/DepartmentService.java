package com.truth.communication.service;

import com.truth.communication.model.Department;
import org.springframework.stereotype.Service;

@Service
public interface DepartmentService {
    Department saveDepartment(Department department);
    Department getDepartmentById(Long departmentId);
}
