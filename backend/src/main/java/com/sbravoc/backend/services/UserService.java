package com.sbravoc.backend.services;

import com.sbravoc.backend.dtos.UserDTO;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<UserDTO> getAllUsers();
    Optional<UserDTO> getUserById(Integer id);
    UserDTO createUser(UserDTO userDTO);
}
