package com.sunsoft.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunsoft.model.InsuranceData;
import com.sunsoft.repository.InsuranceRepository;

@Service
public class InsuranceDao {
	@Autowired
	private InsuranceRepository insuranceRepository;
	
	public void insertData(InsuranceData data) {
		insuranceRepository.save(data);
	}
	public List<InsuranceData> read() {
		List<InsuranceData> list = (List<InsuranceData>) insuranceRepository.findAll();
		return list;
	}
	public void updateById(InsuranceData data) {
		insuranceRepository.save(data);
	}
	public void deleteById(int id) {
		insuranceRepository.deleteById(id);
	}
}
