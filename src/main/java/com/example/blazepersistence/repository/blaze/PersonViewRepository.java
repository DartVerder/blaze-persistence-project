package com.example.blazepersistence.repository.blaze;

import com.blazebit.persistence.spring.data.repository.EntityViewRepository;
import com.example.blazepersistence.view.PersonView;

public interface PersonViewRepository extends EntityViewRepository<PersonView, Long> {
}