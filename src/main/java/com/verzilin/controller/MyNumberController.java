package com.verzilin.controller;

import com.verzilin.domain.MyNumber;
import com.verzilin.service.MyNumberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping({"/number"})
@RequiredArgsConstructor
public class MyNumberController {
    private final MyNumberService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MyNumber addNumber(@RequestBody MyNumber number) {
        log.info("Get number: " + number.getNumberValue());
        return service.createNumber(number);
    }
}
