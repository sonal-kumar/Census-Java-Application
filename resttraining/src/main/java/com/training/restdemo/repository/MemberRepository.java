package com.training.restdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.training.restdemo.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {
	  @Query("select u from Member u where u.memberName = ?1")
	  User findByEmailAddress(String memberName);
}