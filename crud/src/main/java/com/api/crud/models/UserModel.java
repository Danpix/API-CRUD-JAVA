package com.api.crud.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class UserModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String firstName;

    @Column 
    private String lastName;

    @Column 
    private String email;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getfirstName(){
        return firstName;
    }
    public void setfirstName(String firsName){
        this.firstName=firsName;
    }
    public String getlastName(){
        return lastName;
    }
    public void setlastName(String lastName){
        this.lastName=lastName;
    }
    public String getemail(){
        return email;
    }
    public void setemail(String email){
        this.email=email;
    }
}
