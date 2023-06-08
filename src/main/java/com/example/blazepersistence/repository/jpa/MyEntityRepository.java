package com.example.blazepersistence.repository.jpa;

import com.example.blazepersistence.model.Emb;
import com.example.blazepersistence.model.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyEntityRepository extends JpaRepository<MyEntity, Emb> {
}