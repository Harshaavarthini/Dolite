package com.dolite.backend.Utils;

import com.dolite.backend.DTO.UserDTO;
import com.dolite.backend.Entity.UserEntity;

public class UserDTOMapper {


        public UserEntity mapToUserEntity(UserDTO userDTO){
            UserEntity userEntity = new UserEntity();
            userEntity.setUsername(userDTO.getUsername());
            userEntity.setEmail(userDTO.getEmail());
            userEntity.setPassword(userDTO.getPassword());
            userEntity.setGender(userDTO.getGender());
            userEntity.setDate(userDTO.getDate());
            return userEntity;
        }
}
