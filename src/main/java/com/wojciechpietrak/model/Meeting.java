package com.wojciechpietrak.model;


import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "meeting")
public class Meeting extends BaseEntity{


	@Column(name = "title")
	private String title;

	@Column(name = "purpose")
	private String purpose;
	
	@Column (name="date")
	/*@DateTimeFormat(pattern = "dd/MM/yyyy")*/
	private LocalDate date;
	
	@Column (name="time")
	private LocalTime time;
	
    @Column(name = "quantity")
    private Integer quantity;

    public Meeting(){
    	
    };

	public Meeting(String title, String purpose, LocalDate date, LocalTime time, Integer quantity) {
		super();
		this.title = title;
		this.purpose = purpose;
		this.date = date;
		this.time = time;
		this.quantity = quantity;
	}
	public Meeting(String title, String purpose,  Integer quantity) {
		super();
		this.title = title;
		this.purpose = purpose;
/*		date = LocalDate.now();
		time = LocalTime.now(); */
		this.quantity = quantity;
	}


	public String getTitle() {
		
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
    
    
}
