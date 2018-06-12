package com.ucbcba.taller.services;

import com.ucbcba.taller.entities.userProfile;

public interface UserProfileService {
    Iterable<userProfile> listAllProfiles();

    void saveProfile(userProfile profile);

    userProfile getProfile(Integer id);
}
