package org.zerock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.zerock.domain.Board;
import org.zerock.persistence.BoardRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Boot03ApplicationTests {

    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testInsert200() {
        for (int i=1; i<=200; i++) {
            Board board = new Board();

            board.setTitle("제목.." + i);
            board.setContent("내용.." + i + " 채우기");
            board.setWriter("user0" + (i % 10));

            boardRepository.save(board);
        }
    }

}
