package com.ucbcba.taller.repositories;


import com.ucbcba.taller.entities.userProfile;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface UserProfileRepository extends CrudRepository<userProfile,Integer>{
}
