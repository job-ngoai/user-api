package com.minhhuy.userapi.repository;

import com.minhhuy.userapi.entity.Config;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IConfigRepository extends JpaRepository<Config, Integer> {

    @Query("Select us from Config us where us.id like ?1")
    List<Config> getConfigById(int id);
}
