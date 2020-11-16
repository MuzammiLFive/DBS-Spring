package com.sunsoft.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.sunsoft.model.UserData;

@Repository
public interface UserRepository extends CrudRepository<UserData, Integer>{

}
