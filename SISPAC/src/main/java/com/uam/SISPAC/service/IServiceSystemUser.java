package com.uam.SISPAC.service;

import com.uam.SISPAC.model.SystemUser;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IServiceSystemUser {
    public List<SystemUser> getAll();
    public void create(SystemUser systemUser);
    public Optional<SystemUser> getOne(String id);
}
