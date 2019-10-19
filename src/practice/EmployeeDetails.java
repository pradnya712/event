package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeDetails {
	
      public static void main (String[]args) {
	
	    {
	        EmployeeDetails ed = new  EmployeeDetails();
	        Employee employee = new Employee();
	         int choice=0;
	         
	       while(true)
	       {
	    	   System.out.println("1. Employee Id: ");
               System.out.println("2. Employee firstName : ");
               System.out.println("3. Employee lastName: ");
               System.out.println("4. Exit ");
               System.out.println("****Enter option****");
               
              try {
            	  choice=Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
            	  
            	  if(choice==1){
                      System.out.println("Enter Id: ");
                      employee.setId(Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine()));
                    } 
            	 
            	  if(choice==2){
                      System.out.println("Enter firstName: ");
                     employee.setFirstName(((new BufferedReader(new InputStreamReader(System.in))).readLine()));
                        
                  }  
            	  
            	  if(choice==3){
                      System.out.println("Enter lastName: ");
                     employee.setLastName(((new BufferedReader(new InputStreamReader(System.in))).readLine()));
                        
                  }  
            	  if(choice==4){
                      System.out.println("***********"+"\n"+"Id-"+employee.getId());
                      System.out.println("Name-"+employee.getFirstName());
                      System.out.println("Class-"+employee.getLastName());
                      System.exit(1);
              }
			
              } catch (IOException e) {
              System.out.println(e); 
              
			}
                 
	       }
	         
	    }
	}
}
