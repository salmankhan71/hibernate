package com.salman;

public class UserBean {
private String userId;
private String username;
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
@Override
public String toString() {
	return "UserBean [userId=" + userId + ", username=" + username  + "]";
}

}
