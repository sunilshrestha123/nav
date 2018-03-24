package org.nav.solution.serviceImpl;


import org.nav.solution.dao.RegisterDao;
import org.nav.solution.model.Register;
import org.nav.solution.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
@Service
@Transactional
public class RegisterServiceImpl implements RegisterService{
    @Autowired
    private RegisterDao registerDao;
    public void insert(Register register) {
   registerDao.insert(register);
    }
}
