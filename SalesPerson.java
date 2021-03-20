/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CaseStudyIPT2;
import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public class SalesPerson extends Employee{
    public String spCommission;
    public String spTakeOrder;
    public SalesPerson(String spName) {
        super(spName);
    }
@WebMethod
    public void commission (String spCommission){
    this.spCommission = spCommission;
    }@WebMethod
    public String commission (){
    return spCommission;}
    @WebMethod
    public void takeorder (String spTakeOrder){
    this.spTakeOrder = spTakeOrder;
    }
}