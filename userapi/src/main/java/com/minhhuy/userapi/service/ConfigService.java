package com.minhhuy.userapi.service;


import com.minhhuy.userapi.entity.Config;
import com.minhhuy.userapi.model.BaseResponse;
import com.minhhuy.userapi.repository.IConfigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfigService implements IConfig {
    @Autowired
    private IConfigRepository iConfigRepository;

    @Override
    public List<Config> getConfig(int id) {
        List<Config> configs = iConfigRepository.getConfigById(id);
        return configs;
    }
}
