package com.codingdojo.driverslicense.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="persons")
public class Person {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Size(min=2, max=20, message="First Name must be between 2 and 20 characters")
    private String first_name;
	
	@Size(min=2, max=20, message="Last Name must be between 2 and 20 characters")
    private String last_name;
	
    @Column(updatable=false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;
    
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedAt;
	
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
    
    // One to One Relationship
    @OneToOne(mappedBy="person", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private License license;
	
    //  -----------------------------------  
    //  Constructors
    //  -----------------------------------  
    public Person() {
    }

	public Person(Long id, String firstName, String lastName, Date createdAt, Date updatedAt, License license) {
		this.id = id;
		this.first_name = firstName;
		this.last_name = lastName;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.license = license;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public License getLicense() {
		return license;
	}

	public void setLicense(License license) {
		this.license = license;
	}



    
}