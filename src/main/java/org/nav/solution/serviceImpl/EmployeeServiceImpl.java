package org.nav.solution.serviceImpl;


import org.nav.solution.dao.RegisterDao;

import org.nav.solution.model.Employee;
import org.nav.solution.service.EmployeeService;
import org.nav.solution.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{


    public void insert(Employee employee) {

    }
}
