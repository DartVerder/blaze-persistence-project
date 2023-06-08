package com.example.blazepersistence.view;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.IdMapping;
import com.blazebit.persistence.view.Mapping;
import com.example.blazepersistence.model.Person;

@EntityView(Person.class)
public interface PersonView {

    @IdMapping
    Long getId();

    int getAge();

    @Mapping("name")
    String getName();
}