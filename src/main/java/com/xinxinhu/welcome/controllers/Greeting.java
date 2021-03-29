package com.xinxinhu.welcome.controllers;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Greeting
{
    @Id // mark the id field as our database primary key.
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String userName;

    @Column
    @CreationTimestamp

    private Date signedUp;

    public Greeting(String firstName, String lastName, String userName, Date signedUp)
    {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;

        this.signedUp = signedUp;

    }

    public Greeting()
    {
        super();
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public Date getSignedUp()
    {
        return signedUp;
    }

    public void setSignedUp(Date signedUp)
    {
        this.signedUp = signedUp;
    }

    @Override
    public String toString()
    {
        return "Subscriber [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName + ", signedUp=" + signedUp + "]";
    }

}