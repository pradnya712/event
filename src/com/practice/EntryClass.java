package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;



public class EntryClass{

     /*public void studentMethod(int id, String name, int stclass,Double percentage){
        Student student = new Student(id,name,stclass,percentage);
        System.out.println("Student ID: "+student.getId());
        System.out.println("Student name: "+student.getStName());
        System.out.println("Student class: "+student.getStclass());
        System.out.println("student percentage: " +student.getPercentage());
        System.out.println("******"); 

    }
 

     public void employeeMethod(int id, String firstName, String lastName){
        Employee employee = new Employee(id,firstName,lastName);
        System.out.println(" Employee ID: "+employee.getId());
        System.out.println("Employee firstName: "+employee.getFirstName());
        System.out.println("Employee lastName: "+employee.getLastName());
        System.out.println("******");

    }*/
     

    public void studentInput(){
    	Student student = new Student();
      
        
        InputStreamReader r=new InputStreamReader(System.in); 
        BufferedReader br=new BufferedReader(r); 
        
        try {
        	System.out.println("Enter Student Id: ");
            student.setId(Integer.parseInt(br.readLine()));
            
            
            System.out.println("Enter Student Name:");
            student.setStName(br.readLine());
            
            
            
            System.out.println("Enter Student Class:");
            student.setStclass(Integer.parseInt(br.readLine()));
            
            
            
            System.out.println("Enter Student Percentage:");
            student.setPercentage(Double.parseDouble(br.readLine()));
			
		} catch (IOException e)  {
			System.out.println(e);
		}
        
       
        System.out.println("Student ID: "+student.getId());
        System.out.println("student stName: "+student.getStName());
        System.out.println("student stclass: "+student.getStclass());
        System.out.println("student precentage: "+student.getPercentage());
        

       
    }
        
    
        public void employeeInput(){
        	
        Employee employee = new Employee();
       
        
        InputStreamReader r1=new InputStreamReader(System.in);
        BufferedReader br1=new BufferedReader(r1); 
        
        try {
        	System.out.println("Entry employee Id: ");
            employee.setId(Integer.parseInt(br1.readLine()));
            

            System.out.println("entry employee firstName: ");
            employee.setFirstName(br1.readLine());
            
            System.out.println("Entry employee Lastname: ");
            employee.setLastName(br1.readLine());
		
        }
        catch (IOException e) {
			System.out.println(e);
		}
        
        

        System.out.println("employee id: "+employee.getId());
        System.out.println("Employee First Name: "+employee.getFirstName());
        System.out.println("employee Lastname: "+employee.getLastName());

    }
    public static void main(String[] args) {
         
        EntryClass entryClass = new EntryClass();
        entryClass.studentInput();
        entryClass.employeeInput();
        
    }

}    

    



	 