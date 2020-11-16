package com.sunsoft.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sunsoft.model.InsuranceData;

@Repository
public interface InsuranceRepository extends CrudRepository<InsuranceData, Integer>{

}
