package com.dailycodebuffer.managementApplication.service.impl;

import com.dailycodebuffer.managementApplication.model.EmployeeDetails;
import com.dailycodebuffer.managementApplication.repository.EmployeeRepository;
import com.dailycodebuffer.managementApplication.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeServiceImpl implements EmployeeService {
     @Autowired
     private EmployeeRepository employeeRepository;


    @Override
    public EmployeeDetails createUser(EmployeeDetails employeeDetails) {
        return employeeRepository.save(employeeDetails);
    }

    @Override
    public boolean checkEmail(String email){
        return employeeRepository.existsByEmail(email);
    }
}
