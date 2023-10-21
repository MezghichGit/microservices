package com.sip.ams.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestService {

  @Value("${formation}")
  private String formation;
  
  @Value("${formateur}")
  private String formateur;

  @RequestMapping("/course")
  public String tellMeAboutTheCourse(){
      System.out.println("c'est moi qui ai répondu!");
      return formation;
  }
  
  @RequestMapping("/trainer")
  public String tellMeAboutTheTrainer(){
      System.out.println("Coach!");
      return formateur;
  }
}
