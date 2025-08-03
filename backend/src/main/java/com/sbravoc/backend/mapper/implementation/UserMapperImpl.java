package com.sbravoc.backend.mapper.implementation;

import com.sbravoc.backend.dtos.UserDTO;
import com.sbravoc.backend.mapper.UserMapper;
import com.sbravoc.backend.models.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTO toDTO(User user) {
        if (user == null) return null;

        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setUsername(user.getUsername());
        userDTO.setEmail(user.getEmail());
        userDTO.setRole(user.getRole());
        userDTO.setEnabled(user.isEnabled());
        return userDTO;
    }

    @Override
    public User toEntity(UserDTO userDTO) {
        if (userDTO == null) return null;

        User user = new User();
        user.setId(userDTO.getId());
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        user.setRole(userDTO.getRole());
        user.setEnabled(userDTO.isEnabled());
        return user;
    }
}
