package com.wojciechpietrak.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wojciechpietrak.model.Meeting;

@Repository
public interface MeetingRepository extends JpaRepository<Meeting, Long> {


	
}
