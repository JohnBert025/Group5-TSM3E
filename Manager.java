/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;
import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public class Manager  extends Employee{
    public String mAllowance;
    public Manager(String mName) {
        super(mName);
    }@WebMethod
   public void allowance (String mAllowance){
    this.mAllowance = mAllowance;
    }@WebMethod
    public String allowance(){
    return mAllowance;}
    
}

