package org.UserManagementService.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User{
    @Id
    private int id;
    private String name;
    private String eMail;
    private int passwordHash;

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public String getEMail(){
        return eMail;
    }

    public void setEMail(String newEMail){
        eMail = newEMail;
    }

    public int getPasswordHash(){
        return passwordHash;
    }

    public void setPasswordHash(int newPasswordHash){
        passwordHash = newPasswordHash;
    }
}