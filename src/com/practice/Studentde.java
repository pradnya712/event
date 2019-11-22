package com.practice;

import java.io.IOException;

 class Details<T,U,V>{
	
    T tobj;
	U uobj1;
	V vobj2;
	
  Details(T obj,U obj1,V obj2)
	{
		this.tobj=obj;
		this.uobj1=obj1;
		this.vobj2=obj2;
	}
	public T getobject() {
		return this.tobj;	
	}
	public U getobject1() {
		return this.uobj1;
	}
	public V getobject2() {
		return this.vobj2;
		
	}
}

public class Studentde { 
	
	
	public static void main(String[] args) {
		System.out.println("Student details:-");
		try {
			
		
		Details<Integer,String,String> object=new Details<Integer,String, String>(12,"","");
		System.out.println("\n Roll no:-"+object.getobject());
		
		
		
		Details<Integer,String,String> object2=new Details<Integer,String, String>(12,"pradnya","");
		System.out.println("\n Name:-"+object2.getobject1());
		
		
		Details<Integer,String,String> object3=new Details<Integer,String, String>(12,"pradnya","pune");
		System.out.println("\n Address:-"+object3.getobject2());
		
		 }catch (Exception e) {
           System.out.println(e);
         }
		}
    }


