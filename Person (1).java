/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CaseStudyIPT2;
import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 *
 * @author user
 */
@WebService
public class Person { 
    private String pName;
  

    public Person(String pName){
   this.pName=pName;
   }@WebMethod
    public void name (String pName){
    this.pName =pName;
    }@WebMethod
    public String name(){
    return pName;}
    
}
