package org.zerock.boot01.controller;

import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.boot01.domain.SampleVO;

@RestController
@Log
public class SampleController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World~~";
    }

    @GetMapping("/sample")
    public SampleVO makeSample() {

        SampleVO vo = new SampleVO();

        vo.setVal1("v1");
        vo.setVal2("v2");
        vo.setVal3("v3");

        log.info(String.valueOf(vo));

        return vo;

    }
}
