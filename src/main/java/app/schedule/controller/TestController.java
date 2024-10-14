package app.schedule.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/test")
public class TestController {
    private static final Logger LOGGER = LogManager.getLogger(TestController.class.getName());

    /**
     * MVC 테스트
     * @return
     */
    @GetMapping(value = "/hello")
    public String greeting(){
        LOGGER.debug("Debug Message Logged !!!");
        LOGGER.info("Info Message Logged !!!");
        //LOGGER.error("Error Message Logged !!!", new NullPointerException("NullError"));
        return "Hello Spring Boot";
    }

    //조회

    //삭제

    //수정

    //생성


}
