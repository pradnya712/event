package com.practice;

public class Student
{
 
	
    private int id;
    private String stName;
    private int stclass;
    private double percentage;
    private String emailid;
    
    public Student(){
    }
   
    public Student(int id, String stName, int stclass , Double percentage,String emailid) {
        this.id = id;
        this.stName = stName;
        this.stclass = stclass;
        this.percentage = percentage;
        this.emailid = emailid;
    }
    

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public int getStclass() {
        return stclass;
    }
 
    public void setStclass(int stclass) {
        this.stclass = stclass;
    }
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

    }