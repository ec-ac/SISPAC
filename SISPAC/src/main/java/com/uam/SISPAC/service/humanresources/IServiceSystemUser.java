package com.uam.SISPAC.service.humanresources;

import com.uam.SISPAC.dto.humanresources.LoginResponse;
import com.uam.SISPAC.dto.humanresources.SystemUserDto;
import com.uam.SISPAC.model.humanresources.SystemUser;

import java.util.List;
import java.util.Optional;

public interface IServiceSystemUser {
    List<SystemUser> getAll();
    void create(SystemUserDto systemUser);
    Optional<SystemUser> getOne(String id);
    LoginResponse getUser(String names, String password);
}
