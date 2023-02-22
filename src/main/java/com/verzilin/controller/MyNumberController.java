package com.verzilin.controller;

import com.verzilin.domain.MyNumber;
import com.verzilin.service.MyNumberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/number"})
@RequiredArgsConstructor
public class MyNumberController {
    private final MyNumberService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MyNumber addNumber(@RequestBody MyNumber number) {
        return this.service.createNumber(number);
    }
}
