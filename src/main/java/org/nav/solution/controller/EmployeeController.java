package org.nav.solution.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {
    @RequestMapping(value="/employee",method = RequestMethod.GET)
        public String returnEmployee(){
            return "employee";

    }
}
