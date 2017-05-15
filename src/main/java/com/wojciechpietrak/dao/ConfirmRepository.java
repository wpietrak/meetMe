package com.wojciechpietrak.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wojciechpietrak.model.Confirmed;
import com.wojciechpietrak.model.Meeting;

public interface ConfirmRepository extends JpaRepository<Confirmed, Long>{

}
