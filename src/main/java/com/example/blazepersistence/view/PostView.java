package com.example.blazepersistence.view;


import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import com.example.blazepersistence.model.Post;

@EntityView(Post.class)
public interface PostView {

    @Mapping("UPPER(titleNew)")
    String getTitle();

    String getContentNew();
}