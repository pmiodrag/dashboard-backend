package com.twinsoft.dashboardbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity(name="app_customer_image")
public class PersonImage {

	public PersonImage(){}
	
	public PersonImage(String key, String url) {
		this.key = key;
		this.url =url;		
	}

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

	@Column(name = "s3_key", nullable = false, length=200)
	private String key;

	@Column(name = "url", nullable = false, length=1000)
	private String url;
	
}