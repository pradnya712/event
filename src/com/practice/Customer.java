package com.practice;

public class Customer {
	private int Id;
    private String custname;
    private int custphoneno;
    private String custadd;

    public Customer(){

  }
 
    public Customer(int id, String custname, int custphoneno, String custadd) {
         this.Id = id;
        this.custname = custname;
        this.custphoneno = custphoneno;
        this.custadd = custadd;
}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public int getCustphoneno() {
		return custphoneno;
	}

	public void setCustphoneno(int custphoneno) {
		this.custphoneno = custphoneno;
	}

	public String getCustadd() {
		return custadd;
	}

	public void setCustadd(String custadd) {
		this.custadd = custadd;
	}

    
	
    
    }