package com.verzilin.service;

import com.verzilin.domain.MyNumber;
import com.verzilin.repo.MyNumberRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MyNumberService {
    private final MyNumberRepo myNumberRepo;

    public MyNumber createNumber(MyNumber myNumber) {
        log.info("Create MyNumber:" + myNumber.toString());
        return myNumberRepo.save(myNumber);
    }
}
