public class MainMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     

    Customer c1 = new Customer("john bert briones");
 Person pn = new Person("john bert briones");
    SalesPerson sp2 = new SalesPerson("employee");
      SalesPerson sp3 = new SalesPerson("manager");
      SalesPerson sp4 = new SalesPerson("salesperson");
      SalesPerson sp5 = new SalesPerson("secretary");
 Manager m1 = new Manager("");
     
  Printer p1 = new Printer();
  //input
    c1.budget("2000");
    
   sp2.employeeNumber("31313");
  sp2.basicSalary("42424");
  
  sp3.employeeNumber("5151");
  sp3.basicSalary("1515");
   m1.allowance("1515");
   
  sp4.employeeNumber("124214");
  sp4.basicSalary("3123123");
  sp4.commission("333333");
 
  
  sp5.employeeNumber("5125125");
  sp5.basicSalary("123123");
  

  //output
  p1.print(pn);
    p1.print1(c1);
  p1.print2(sp2);
  p1.print3(m1);
  p1.print2(sp3);
 p1.print2(sp4);
  p1.print2(sp5);


   
    
    }
    
    
}
