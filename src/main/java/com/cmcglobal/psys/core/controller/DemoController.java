package com.cmcglobal.psys.core.controller;

import com.cmcglobal.psys.core.domain.User;
import com.cmcglobal.psys.core.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * DemoController
 */
@Controller
public class DemoController {

  @Autowired
  UserService service;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public ModelAndView requestMethodName(@RequestParam String id) {
    ModelAndView mv = new ModelAndView("demo");

    User u = service.select(id);
    mv.addObject("user", u);
    
    return mv;
  }

}