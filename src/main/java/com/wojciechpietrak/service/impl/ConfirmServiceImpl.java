package com.wojciechpietrak.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wojciechpietrak.dao.ConfirmRepository;
import com.wojciechpietrak.model.Confirmed;
import com.wojciechpietrak.service.ConfirmService;

@Service
public class ConfirmServiceImpl implements ConfirmService{

	@Autowired
	private ConfirmRepository confirmRepository;
	
	@Override
	public List<Confirmed> findAll() {
		// TODO Auto-generated method stub
		return confirmRepository.findAll();
	}

}
