package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CustomeDetails {
	public static void main(String[] args) {
        
		CustomeDetails std=new CustomeDetails();
		Customer cust1=new Customer();
     
         
           int choice=0;

          while(true){
              System.out.println("1. Customer Id: ");
              System.out.println("2. Customer Name: ");
              System.out.println("3. Customer phoneno: ");
              System.out.println("4. Customer adderes: ");
              System.out.println("5. Exit ");
              System.out.println("****Enter option****");
          
              try {
                  choice=Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());

                  if(choice==1){
                      System.out.println("Enter Id: ");
                      cust1.setId(Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine()));
                      
                  }    

                  if(choice==2){
                      System.out.println("Enter Name: ");
                      cust1.setCustname((new BufferedReader(new InputStreamReader(System.in))).readLine());
                        
                  }  

                  if(choice==3){
                      System.out.println("Enter Class: ");
                      cust1.setCustphoneno(Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine()));
                      
                  }
                  if(choice==4){
                      System.out.println("Enter percentage: ");
                      cust1.setCustadd(Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine()));
                      
                  }
                  if(choice==5){
                         
              }catch (IOException e) {
                       System.out.println(e);
              }
          }
  
      
  

}
