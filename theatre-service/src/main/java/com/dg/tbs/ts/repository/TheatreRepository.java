package com.dg.tbs.ts.repository;

import com.dg.tbs.ts.entity.TheatreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface TheatreRepository extends JpaRepository<TheatreEntity, Long > {
    Stream<TheatreEntity> findAllByCity(String cityId);
}
