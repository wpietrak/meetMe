package com.wojciechpietrak.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wojciechpietrak.model.Confirmed;

public interface ConfirmRepository extends JpaRepository<Confirmed, Long>{

}
