package com.training.center.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.center.entity.CenterInformation;

@Repository
public interface CenterServiceDao extends JpaRepository<CenterInformation, String> {

}
