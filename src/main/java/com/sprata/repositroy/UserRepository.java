package com.test2.repositroy;

import com.test2.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository <Member,Long>{
    List<Member> findAllBy();
}
