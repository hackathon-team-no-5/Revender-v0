package com.revender.hackathon.repository;

import com.revender.hackathon.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
