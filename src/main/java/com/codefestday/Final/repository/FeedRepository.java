package com.codefestday.Final.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codefestday.Final.entity.Keywords;

@Repository
public interface FeedRepository extends JpaRepository<Keywords, Integer> {

}