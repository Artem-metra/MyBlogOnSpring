package com.revigo.myblog.repo;

import com.revigo.myblog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
