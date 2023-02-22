package com.verzilin.repo;

import com.verzilin.domain.MyNumber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyNumberRepo extends JpaRepository<MyNumber, Long> {
}
