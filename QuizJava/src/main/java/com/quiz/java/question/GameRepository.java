package com.quiz.java.question;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
    List<Game> findByPlayerId(String playerId);
}
