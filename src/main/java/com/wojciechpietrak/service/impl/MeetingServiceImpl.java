package com.wojciechpietrak.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wojciechpietrak.dao.MeetingRepository;
import com.wojciechpietrak.model.Meeting;
import com.wojciechpietrak.service.MeetingService;

@Service
public class MeetingServiceImpl implements MeetingService {
	
	@Autowired
	private MeetingRepository meetingRepository;

	@Override
	public List<Meeting> findAll() {		
		return meetingRepository.findAll();
	}

	@Override
	public void save(Meeting meeting) {
		meetingRepository.save(meeting);			
	}

	@Override
	public Meeting findById(Long id) {
		return meetingRepository.findOne(id);		
	}

	@Override
	public void delete(Long id) {
		meetingRepository.delete(id);	
	}

}
