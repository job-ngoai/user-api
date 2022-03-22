package com.minhhuy.userapi.repository;

import com.minhhuy.userapi.entity.UserNormal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Queue;

@Repository
public interface IUserNormalRepository extends JpaRepository<UserNormal, Long> {

    @Query("Select us from UserNormal us where us.username like ?1")
    List<UserNormal> findByUserName(String username);



}
