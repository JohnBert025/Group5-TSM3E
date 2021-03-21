/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CaseStudyIPT2;
import javax.jws.WebService;
import javax.jws.WebMethod;
@WebService
public class Employee extends Person {
    public String empNumber;
    public String empBasicSalary;
    
    public Employee(String empName) {
        super(empName);
    }
     @WebMethod
    public void employeeNumber (String empNumber){
    this.empNumber = empNumber;}
    @WebMethod
    public String employeeNumber(){
    return empNumber;}
    @WebMethod
      public void basicSalary (String empBasicSalary){
    this.empBasicSalary = empBasicSalary;}
    @WebMethod
    public String basicSalary(){
    return empBasicSalary;}
    
}
