package com.sbravoc.backend.mapper;

import com.sbravoc.backend.dtos.UserDTO;
import com.sbravoc.backend.models.User;

public interface UserMapper {
    UserDTO toDTO(User user);
    User toEntity(UserDTO userDTO);
}
