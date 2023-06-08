package com.example.blazepersistence.view;


import com.blazebit.persistence.view.EntityView;
import com.example.blazepersistence.model.Post;

@EntityView(Post.class)
public interface PostWithAuthorView extends PostView {
    PersonView getAuthor();

}