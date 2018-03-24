package org.nav.solution.controller;

import org.nav.solution.model.Register;
import org.nav.solution.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {
    @Autowired
    private RegisterService registerService;
    @RequestMapping(value="/register",method = RequestMethod.GET)
    public String returnRegister(){
        return "register";

    }
    @RequestMapping(value="/save",method = RequestMethod.POST)
    public String save(@RequestParam("registerName") String registerName,
                       @RequestParam("registerEmail") String registerEmail,
                       @RequestParam("registerPassword") String registerPassword) {


        Register register=new Register();
        register.setRegisterName(registerName);
        register.setRegisterEmail(registerEmail);
        register.setRegisterPassword(registerPassword);
        registerService.insert(register);
        return "redirect:/index";
    }
}


