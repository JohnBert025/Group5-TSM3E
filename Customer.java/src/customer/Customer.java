package customer;
import javax.jws.WebService;
import javax.jws.WebMethod;
/**
 *
 * @author user
 */
@WebService
public class Customer { 
    private String pName;
  

    public Customer(String pName){
   this.pName=pName;
   }@WebMethod
    public void name (String pName){
    this.pName =pName;
    }@WebMethod
    public String name(){
    return pName;}
    
}

public class Person extends Customer{
    private String cAddress;
    private String cBudget;
    private String cPurchase;
    
    public Person(String cName) {
        super(cName);
    }
 public void address(String cAddress){
 this.cAddress=cAddress;}

        public void budget (String cBudget){
   this.cBudget = cBudget;
    } 
       public String budget(){
    return cBudget;}
       
     public void purchase (String cPurchase){
   this.cPurchase = cPurchase;
    } 
}