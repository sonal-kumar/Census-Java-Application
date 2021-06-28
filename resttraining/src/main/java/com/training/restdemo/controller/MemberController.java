package com.training.restdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.restdemo.entity.Member;
import com.training.restdemo.service.MemberService;

@RestController
public class MemberController {
	@Autowired
	private MemberService memberservice;
	 @GetMapping("/members")
	  List<Member> all() {
	    return memberservice.findAllMembers();
	  }
	  // end::get-aggregate-root[]

	  @PostMapping("/members")
	  Member newMember(@RequestBody Member newEmployee) {
	    return memberservice.saveNewMember(newEmployee);
	  }
	  
	  @GetMapping("/greeting")
	  public String greetings() {
		  return "Hello How are you?";
	  }

	  


}