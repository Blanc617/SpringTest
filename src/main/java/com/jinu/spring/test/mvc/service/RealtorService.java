package com.jinu.spring.test.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jinu.spring.test.mvc.domain.Realtor;
import com.jinu.spring.test.mvc.repository.RealtorRepository;

@Service
public class RealtorService {

	@Autowired
	private RealtorRepository realtorRepository;
	
	public int addRealtor(Realtor realtor) {
		return realtorRepository.insertRealtor(realtor);
	}
}
