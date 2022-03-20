package com.hibernate.project1;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="users")
public class Users{
	

	public Users(int users_Id, String users_fname, String users_lname, String users_email) {
		this.users_Id = users_Id;
		this.users_fname = users_fname;
		this.users_lname = users_lname;
		this.users_email = users_email;
	}

	public Users() {
		// TODO Auto-generated constructor stub
	}

	@Id 
	@Column(name="users_Id")
	int users_Id;
	
	@Column(name="users_fname")
	String users_fname;
	
	@Column(name="users_lname")
	String users_lname;
	
	@Column(name="users_email")
	String users_email;

	public int getUsers_Id() {
		return users_Id;
	}

	public void setUsers_Id(int users_Id) {
		this.users_Id = users_Id;
	}

	public String getUsers_fname() {
		return users_fname;
	}

	public void setUsers_fname(String users_fname) {
		this.users_fname = users_fname;
	}

	public String getusers_lname() {
		return users_lname;
	}

	public void setUsers_lname(String users_lname) {
		this.users_lname = users_lname;
	}

	public String getUsers_email() {
		return users_email;
	}

	public void setUsers_email(String users_email) {
		this.users_email = users_email;
	}
	

}


