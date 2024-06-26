package com.dailycodebuffer.managementApplication.service;

import com.dailycodebuffer.managementApplication.model.EmployeeDetails;

public interface EmployeeService {

    public EmployeeDetails createUser(EmployeeDetails employeeDetails);


    boolean checkEmail(String email);
}
