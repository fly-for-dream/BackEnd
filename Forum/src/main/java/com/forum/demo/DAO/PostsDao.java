package com.forum.demo.DAO;

import com.forum.demo.Entity.PostsEntity;
import javafx.geometry.Pos;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostsDao extends JpaRepository<PostsEntity,String> {
    List<PostsEntity> findAllByUseridIn(String userid, Pageable page);

    List<PostsEntity> findAllByTitleIn(String value, Pageable page);

    List<PostsEntity> findAllByTypeIn(String type, Pageable page);
}
