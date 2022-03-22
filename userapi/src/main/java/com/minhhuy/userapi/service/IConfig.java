package com.minhhuy.userapi.service;

import com.minhhuy.userapi.entity.Config;
import com.minhhuy.userapi.model.BaseResponse;

import java.util.List;

public interface IConfig {
    List<Config> getConfig(int id);
}
