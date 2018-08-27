package org.zerock.boot02;

import lombok.extern.java.Log;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.zerock.boot02.domain.Board;
import org.zerock.boot02.domain.NotFoundEntity;
import org.zerock.boot02.persistence.BoardRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log
public class BoardRepositoryTests {

    @Autowired
    private BoardRepository boardRepo;

    @Test
    public void inspect() {
        Class<?> clz = boardRepo.getClass();
        log.info("실제 객체의 클래스 이름 : " + String.valueOf(clz));

        Class<?>[] interfaces = clz.getInterfaces();
        Stream.of(interfaces).forEach(inter -> {
            log.info("인터페이스 목록 : " + inter.getName());
        });

        Class<?> superClasses = clz.getSuperclass();
        log.info("클래스의 부모 클래스 : " + String.valueOf(superClasses));
    }

    @Test
    public void testInsert() {
        boardRepo.save(new Board("aa", "bb", "cc").toEntity());
    }

    @Test
    public void testRead() {

        Iterable<Board> list = boardRepo.findAll();
        //log.info(board.get().getTitle());

        log.info(String.valueOf(list));
    }

    @Test
    public void testUpdate() {

        Board board = boardRepo.findById(133L)
                .orElseThrow(() -> new NotFoundEntity(1L));

        log.info(board.getTitle());

        /*
        Optional<Board> board = boardRepo.findById(1L);
        if (board.isPresent()){
            Board oldBoard = board.get();
            oldBoard.setTitle("수정된 제목입니다.");

            boardRepo.save(oldBoard);
        }
        else{
            // alternative processing....
        }
        */

    }

}
