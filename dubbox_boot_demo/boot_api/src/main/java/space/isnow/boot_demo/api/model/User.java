package space.isnow.boot_demo.api.model;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = -3597039887871548859L;
	
	private String userId;
	
	private String username;
	
	private String age;
	
	private String password;


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	

}
