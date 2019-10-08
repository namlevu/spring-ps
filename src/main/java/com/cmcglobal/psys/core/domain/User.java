package com.cmcglobal.psys.core.domain;

/**
 * User Entity
 */

public class User {

  private String id;
  private String username;
  private String password;
  private String email;

  public String getId() {
    return id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
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

  public void setId(String id) {
    this.id = id;
  }
}