package com.minhhuy.userapi.rest_controller;

import com.minhhuy.userapi.entity.Config;
import com.minhhuy.userapi.model.BaseResponse;
import com.minhhuy.userapi.repository.IConfigRepository;
import com.minhhuy.userapi.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/v1/config")
public class ConfigController {

    @Autowired
    private ConfigService configService;

    @GetMapping("")
    public List<Config> getConfig(@RequestParam int id) {

        return configService.getConfig(id);
    }
}
