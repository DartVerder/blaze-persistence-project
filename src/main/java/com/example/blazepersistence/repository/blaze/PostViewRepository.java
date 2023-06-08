package com.example.blazepersistence.repository.blaze;

import com.blazebit.persistence.spring.data.repository.EntityViewRepository;
import com.example.blazepersistence.view.PostView;

public interface PostViewRepository extends EntityViewRepository<PostView, Long> {
}