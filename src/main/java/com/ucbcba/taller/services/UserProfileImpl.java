package com.ucbcba.taller.services;


import com.ucbcba.taller.entities.userProfile;
import com.ucbcba.taller.repositories.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import sun.plugin.util.UserProfile;

@Service
public class UserProfileImpl implements UserProfileService {
    private UserProfileRepository userProfileRepository;

    @Autowired
    @Qualifier(value = "userProfileRepository")
    public void setUserProfileRepository(UserProfileRepository userProfileRepository) {
        this.userProfileRepository = userProfileRepository;
    }

    @Override
    public Iterable<userProfile> listAllProfiles() {
        return userProfileRepository.findAll();
    }

    @Override
    public void saveProfile(userProfile profile) {
        userProfileRepository.save(profile);
    }

    @Override
    public userProfile getProfile(Integer id) {
        return userProfileRepository.findOne(id);
    }
}
