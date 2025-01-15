package com.sopt.bbangzip.domain.userSubject.repository;

import com.sopt.bbangzip.domain.userSubject.entity.UserSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserSubjectRepository extends JpaRepository<UserSubject, Long> {

    // userId, year, semester를 통해 UserSubject 조회
    Optional<UserSubject> findByUserIdAndYearAndSemester(Long userId,  int year, String semester);

    // userId와 userSubjectId로 UserSubject 조회
    Optional<UserSubject> findByUserIdAndId(Long userId, Long userSubjectId);
}

