package com.sprata.repositroy;

import com.sprata.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Member,Long>{
    List<Member> findAllBy();
}
