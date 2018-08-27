package org.zerock.boot02.domain;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT) // 409
public class NotFoundEntity extends RuntimeException {
    public NotFoundEntity(Long id){
        super("id " + id + " does not exist.");
    }
}
