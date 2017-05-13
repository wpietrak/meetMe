package com.wojciechpietrak.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "confirm")
public class Confirmed extends BaseEntity{

	 public enum Status { CONFIRMED, CANCELED }
	
	    @Column(name = "status")
	    @Enumerated(EnumType.STRING)
	    private Status status = Status.CONFIRMED;

	    @ManyToOne(fetch = FetchType.EAGER)
	    @JoinColumn(name = "user_id")
	    private User user;

	    @ManyToOne(fetch = FetchType.EAGER)
	    @JoinColumn(name = "book_id")
	    private Meeting meeting;
}
