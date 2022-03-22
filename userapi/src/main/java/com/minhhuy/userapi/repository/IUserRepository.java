package com.minhhuy.userapi.repository;

import com.minhhuy.userapi.entity.UserFB;
import com.minhhuy.userapi.entity.UserNormal;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserRepository extends JpaRepository<UserFB, Long> {

    @Query("Select us from UserFB us ORDER BY us.id DESC ")
    Page<List<UserFB>> getAllUser(Pageable pageable);

}
