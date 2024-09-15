package com.ITSchool.REST_APIs_study.repositories;

import com.ITSchool.REST_APIs_study.models.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
