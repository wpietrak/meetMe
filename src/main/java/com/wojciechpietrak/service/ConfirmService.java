package com.wojciechpietrak.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.wojciechpietrak.model.Confirmed;

public interface ConfirmService {

	List<Confirmed> findAll();

	void save(Confirmed confirmed);
//ta linia
	List<Confirmed> findAll(Sort sort);

}
