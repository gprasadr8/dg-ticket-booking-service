package com.distinctgeeks.bmt.ms.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.distinctgeeks.bmt.ms.persistence.entity.MovieEntity;

public interface MovieRepository extends JpaRepository<MovieEntity, Long> {

}
