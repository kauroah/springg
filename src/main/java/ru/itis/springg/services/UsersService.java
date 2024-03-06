package ru.itis.springg.services;

import ru.itis.springg.dto.UserDto;

import java.util.List;

public interface UsersService {
    List<UserDto> getAllUsers();

}
