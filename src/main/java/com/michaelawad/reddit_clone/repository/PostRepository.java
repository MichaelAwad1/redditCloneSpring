package com.michaelawad.reddit_clone.repository;

import com.michaelawad.reddit_clone.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
