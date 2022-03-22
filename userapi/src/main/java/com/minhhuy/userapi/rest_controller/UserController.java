package com.minhhuy.userapi.rest_controller;

import com.google.gson.Gson;
import com.minhhuy.userapi.LoginDTO;
import com.minhhuy.userapi.entity.UserFB;
import com.minhhuy.userapi.entity.UserNormal;
import com.minhhuy.userapi.model.BaseResponse;
import com.minhhuy.userapi.service.IUser;
import com.minhhuy.userapi.service.UserService;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/v1/getFb")
public class UserController {
    Gson gson = new Gson();
    @Autowired
    private IUser iUser;

    @PostMapping(value = "/create")
    public BaseResponse<Boolean> createUserFacebook(@RequestBody String body) {
        UserFB userFB = gson.fromJson(body, UserFB.class);
        return iUser.createUser(userFB);
    }

    @GetMapping(value ="/all")
    public BaseResponse<Page<List<UserFB>>> getAllUser(@RequestParam ("page") int page) {
        return iUser.getAllUser(page);
    }


    @PostMapping(value = "/login")
    public BaseResponse<Boolean> login(@RequestBody String body ) {
        LoginDTO loginDTO = gson.fromJson(body,LoginDTO.class);
        return iUser.loginUser(loginDTO);
    }

    @PostMapping(value = "/register")
    public BaseResponse<Boolean> register(@RequestBody String body ) {
        UserNormal userNormal = gson.fromJson(body,UserNormal.class);
        return iUser.registerUser(userNormal);
    }

    @PostMapping(value = "/update-all")
    public BaseResponse<Boolean> updateAll() {
        return iUser.updateField();
    }

}
