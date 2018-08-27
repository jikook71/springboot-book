package org.zerock.boot02.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.zerock.boot02.domain.Board;

public interface BoardRepository extends CrudRepository<Board, Long> {

}
