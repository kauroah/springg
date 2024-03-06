package ru.itis.springg.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.itis.springg.dto.UserDto;
import ru.itis.springg.repositories.UsersRepository;

import java.util.List;

import static ru.itis.springg.dto.UserDto.userList;

@Component
public class UsersServiceImpl implements UsersService{

    @Autowired
    private UsersRepository usersRepository;
    @Override
    public List<UserDto> getAllUsers() {
        return userList(usersRepository.findAll());
    }
}
