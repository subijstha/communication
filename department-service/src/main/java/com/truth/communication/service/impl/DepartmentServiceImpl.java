package com.truth.communication.service.impl;

import com.truth.communication.model.Department;
import com.truth.communication.repo.DepartmentRepo;
import com.truth.communication.service.DepartmentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepo departmentRepo;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepo.save(department);
    }

    @Override
    public Department getDepartmentById(Long departmentId) {
        return departmentRepo.findById(departmentId).get();
    }
}
