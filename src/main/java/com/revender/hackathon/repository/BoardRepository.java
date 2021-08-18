package com.revender.hackathon.repository;

import com.revender.hackathon.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {
    
    List<Board> findByTitleOrContent(String title, String content);
}
