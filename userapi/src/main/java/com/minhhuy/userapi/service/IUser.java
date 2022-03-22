package com.minhhuy.userapi.service;

import com.minhhuy.userapi.LoginDTO;
import com.minhhuy.userapi.entity.UserFB;
import com.minhhuy.userapi.entity.UserNormal;
import com.minhhuy.userapi.model.BaseResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IUser {
    BaseResponse<Page<List<UserFB>>> getAllUser(int page);
    BaseResponse<Boolean> createUser(UserFB user);
    BaseResponse<Boolean> registerUser(UserNormal userNormal);
    BaseResponse<Boolean> loginUser(LoginDTO loginDTO);
    BaseResponse<Boolean> updateField();
}
