package com.verzilin.service;

import com.verzilin.domain.MyNumber;
import com.verzilin.repo.MyNumberRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyNumberService {
    private final MyNumberRepo myNumberRepo;

    public MyNumber createNumber(MyNumber myNumber) {
        return (MyNumber)this.myNumberRepo.save(myNumber);
    }


}
