package com.elitekaycy.testlabs.labs.simpleService;

public class User {
  String name;
  String email;

  public User(String name, String email) {
    this.name = name;
    this.email = email;
  }

  @Override
  public String toString() {
    return "User [name=" + name + ", email=" + email + "]";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
