package com.dolite.backend.Service;

import com.dolite.backend.DTO.UserDTO;
import com.dolite.backend.Entity.UserEntity;
import com.dolite.backend.Repository.UserRepo;
import com.dolite.backend.Utils.UserDTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    public void saveUser(UserDTO userDTO) {
        UserDTOMapper userDTOMapper = new UserDTOMapper();
        UserEntity user = userDTOMapper.mapToUserEntity(userDTO);
        userRepo.save(user);
    }
}
