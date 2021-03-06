package ru.javabegin.training.objects;

import javax.validation.constraints.Size;

public class User {
	
	@Size(min = 6, max = 12, message = "Name should have 6 - 12 symbols")
	private String name;

	@Size(min = 5, max= 10, message = "Password should have 5 - 10 symbols")
	private String password;
	
	private boolean admin;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
}
