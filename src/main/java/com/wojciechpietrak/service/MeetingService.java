package com.wojciechpietrak.service;

import java.util.List;

import com.wojciechpietrak.model.Meeting;


public interface MeetingService {

	List<Meeting> findAll();

	void save(Meeting meeting);

	Meeting findById(Long id);

	void delete(Long id);

}
