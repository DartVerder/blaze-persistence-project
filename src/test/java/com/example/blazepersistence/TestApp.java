package com.example.blazepersistence;

import com.example.blazepersistence.model.Emb;
import com.example.blazepersistence.model.MyEntity;
import com.example.blazepersistence.model.Person;
import com.example.blazepersistence.model.Post;
import com.example.blazepersistence.repository.blaze.PostViewRepository;
import com.example.blazepersistence.repository.jpa.MyEntityRepository;
import com.example.blazepersistence.repository.jpa.PersonRepository;
import com.example.blazepersistence.repository.jpa.PostRepository;
import com.example.blazepersistence.view.PostView;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.List;

@SpringBootTest
public class TestApp {

    @BeforeAll
    static void before(@Autowired PersonRepository personRepository, @Autowired PostRepository postRepository, @Autowired MyEntityRepository myEntityRepository) {

        Person person = new Person();
        person.setAge(18);
        person.setName("Ilya");
        person.setId(1L);
        personRepository.save(person);

        Post post = new Post();
        post.setId(1L);
        post.setTitleNew("titl");
        post.setAuthor(person);
        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        post.setTestCollection(set);
        postRepository.save(post);

        MyEntity myEntity = new MyEntity();
        Emb emb = new Emb();
        emb.setNnn("123");
        emb.setStr("sss");
        myEntity.setEmb(emb);
        myEntity.setTest("test");
        myEntity.setCase1("case1");
        myEntityRepository.save(myEntity);
    }

    @Test
    void test(@Autowired PostViewRepository postViewRepository) {
        List<PostView> postViewRepositoryAll = (List<PostView>) postViewRepository.findAll();
        assert postViewRepositoryAll.size() > 0;
    }

    @AfterAll
    static void after(@Autowired PersonRepository personRepository, @Autowired PostRepository postRepository, @Autowired MyEntityRepository myEntityRepository) {
        myEntityRepository.deleteAll();
        postRepository.deleteAll();
        personRepository.deleteAll();
    }
}
