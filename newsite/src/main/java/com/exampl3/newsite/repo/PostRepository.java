package com.exampl3.newsite.repo;

import com.exampl3.newsite.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository <Post,Long> {
}
