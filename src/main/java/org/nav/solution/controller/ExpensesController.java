package org.nav.solution.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ExpensesController {
    @RequestMapping(value="/expenses",method = RequestMethod.GET)
    public String returnExpenses(){
        return "dailyexpenses";

    }

}
