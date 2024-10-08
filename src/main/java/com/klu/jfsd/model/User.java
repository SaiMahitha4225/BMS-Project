package com.klu.jfsd.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_table")
public class User 
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  
  @Column(name="user_uname",nullable=false,length = 50)
  private String username;
  @Column(name="user_email",nullable=false,unique = true,length = 30)
  private String email;
  @Column(name="user_pwd",nullable=false,length = 30)
  private String password;
  @Column(name="user_rpwd",nullable=false,length = 30)
  private String rpassword;
  
  //------------Getters and Setters-----------//
  
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
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
  public String getRpassword() {
    return rpassword;
  }
  public void setRpassword(String rpassword) {
    this.rpassword = rpassword;
  }
  
  
  @Override
  public String toString() {
    return "User [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password+ ", rpassword=" + rpassword+ " ]";
  }
}