package com.springboot.demo.entity;

public class User {

  private String userName;
  private String password;

  @Override
  public String toString() {
    return "User{" + "userName='" + userName + '\'' + ", password='" + password + '\'' + '}';
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public User() {}

  public User(String userName, String password) {
    this.userName = userName;
    this.password = password;
  }
}
