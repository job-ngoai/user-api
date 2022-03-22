package com.minhhuy.userapi.service;

import com.minhhuy.userapi.LoginDTO;
import com.minhhuy.userapi.entity.UserFB;
import com.minhhuy.userapi.entity.UserNormal;
import com.minhhuy.userapi.model.BaseResponse;
import com.minhhuy.userapi.repository.IUserNormalRepository;
import com.minhhuy.userapi.repository.IUserRepository;
import io.ipinfo.api.IPinfo;
import io.ipinfo.api.model.IPResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class UserService implements IUser{

    @Autowired
    private IUserRepository iUserRepository;



    @Autowired
    private IUserNormalRepository iUserNormalRepository;
    @Override
    public BaseResponse<Page<List<UserFB>>> getAllUser(int page) {
        Page<List<UserFB>> list = iUserRepository.getAllUser( PageRequest.of(page, 50));
        if(list.hasContent()) {
            return new BaseResponse<>(200,"sucess",list);

        }
        return new BaseResponse<>(400,"",list);
    }

    @Override
    public BaseResponse<Boolean> createUser(UserFB user) {
        try{
            IPinfo ipInfo = new IPinfo.Builder()
                    .setToken("b8049769faa4d3")
                    .build();
            IPResponse response = ipInfo.lookupIP(user.getIpAddress());
            SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy ' - ' HH:mm");
            Date date = new Date(System.currentTimeMillis());
            user.setCreatedTime(formatter.format(date));
            user.setUpdatedTime(formatter.format(date));
            String cookies = user.getCookie().replaceAll("<br />", "");
            user.setCountry(response.getCountryCode());
            user.setCookie(cookies);
            iUserRepository.save(user);
            return new BaseResponse<Boolean>(200, "success!", true);
        } catch (Exception e) {
            return new BaseResponse<Boolean>(404, "failed!", true);
        }

    }

    @Override
    public BaseResponse<Boolean> registerUser(UserNormal userNormal) {
        try {
            SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy ' - ' HH:mm");
            Date date = new Date(System.currentTimeMillis());
            userNormal.setCreatedTime(formatter.format(date));
            userNormal.setUpdatedTime(formatter.format(date));
            iUserNormalRepository.save(userNormal);
            return new BaseResponse<Boolean>(200, "success!", true);
        }catch (Exception e) {
            return new BaseResponse<Boolean>(404, "failed!", true);
        }
    }

    @Override
    public BaseResponse<Boolean> loginUser(LoginDTO loginDTO) {
        try {

            List<UserNormal> listUserName =  iUserNormalRepository.findByUserName(loginDTO.getUsername());
            if(listUserName.size() != 0) {
                return new BaseResponse<Boolean>(200, "success!", true);
            }
            return new BaseResponse<Boolean>(400, "failed!", true);
        }catch (Exception e) {
            return new BaseResponse<Boolean>(404, "failed!", true);
        }
    }

    @Override
    public BaseResponse<Boolean> updateField() {
        try {
            List<UserFB> listAll = iUserRepository.findAll();
            for(int i = 0 ;i < listAll.size();i++) {
                String cookie = listAll.get(i).getCookie().replaceAll("<br />", "");
                listAll.get(i).setCookie(cookie);
                iUserRepository.save(listAll.get(i));

            }
            return new BaseResponse<Boolean>(200, "success!", true);
        } catch (Exception e) {
            return new BaseResponse<Boolean>(404, "failed!", true);
        }
    }
}
