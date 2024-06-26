package com.dailycodebuffer.managementApplication.repository;

import com.dailycodebuffer.managementApplication.model.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeDetails, Long> {


}
