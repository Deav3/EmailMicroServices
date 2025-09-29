package com.Emailms.www.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Emailms.www.model.Email;

public interface EmailRepository extends JpaRepository<Email, Long> 
{
	

}
