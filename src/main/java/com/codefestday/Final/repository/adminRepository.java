package com.codefestday.Final.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codefestday.Final.entity.Admin;

@Repository
public interface adminRepository extends JpaRepository<Admin, Integer> {

}
