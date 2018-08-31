package org.zerock.persistence;

import org.springframework.data.repository.CrudRepository;
import org.zerock.domain.Board;

import java.util.List;

public interface BoardRepository extends CrudRepository<Board, Long> {

    public List<Board> findBoardByTitle(String title);

}
