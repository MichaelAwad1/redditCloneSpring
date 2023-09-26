package com.michaelawad.reddit_clone.repository;

import com.michaelawad.reddit_clone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
}
