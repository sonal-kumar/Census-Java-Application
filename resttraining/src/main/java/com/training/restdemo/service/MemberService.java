package com.training.restdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.restdemo.entity.Member;
import com.training.restdemo.repository.MemberRepository;
@Service
public class MemberService {
	
   @Autowired
	private MemberRepository memberRepository;
	
	public List<Member> findAllMembers() {
		// TODO Auto-generated method stub
		return  memberRepository.findAll();
	}

	public Member saveNewMember(Member member) {
		// TODO Auto-generated method stub
		return memberRepository.save(member);
	}

}
