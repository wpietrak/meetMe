package com.wojciechpietrak.model;

import java.time.LocalTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "meeting")
public class Meeting extends BaseEntity{

	@NotNull
	@Length(min = 1, max = 255)
	@Column(name = "title")
	private String title;
	
	@NotNull
	@Length(min = 1, max = 255)
	@Column(name = "purpose")
	private String purpose;
	
	@NotNull
	@Column (name="date")
	private String date;
	
	@NotNull
	@Column (name="time")
	private LocalTime time;
	
	@NotNull
    @Column(name = "duration")
    private Integer duration;

    public Meeting(){
    	
    };
    
	public Meeting(String title, String purpose, String date, LocalTime time, Integer duration) {
		super();
		this.title = title;
		this.purpose = purpose;
		this.date = date;
		this.time = time;
		this.duration = duration;
	}

	public Meeting(String title, String purpose,  Integer duration) {
		super();
		this.title = title;
		this.purpose = purpose;
		this.duration = duration;
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
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}
    
    
}
