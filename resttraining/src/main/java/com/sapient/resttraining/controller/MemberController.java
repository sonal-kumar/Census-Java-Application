/**
 * 
 */
package com.sapient.resttraining.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.resttraining.entity.Member;
import com.sapient.resttraining.exception.MemberNotFoundException;
import com.sapient.resttraining.service.MemberService;

/**
 * @author admi
 *
 */
@RestController
public class MemberController {
	@Autowired
	private MemberService memberservice;
	 @GetMapping("/members")
	  List<Member> all() {
	    return memberservice.findAllMembers();
	  }
	  // end::get-aggregate-root[]

//	  @PostMapping("/members")
//	  Member newMember(@RequestBody Member membersList) {
//		  
//		  
//	    return memberservice.saveNewMember(membersList);
//	  }
	  
	  @PostMapping("/members")
	  List<Member> newMember(@RequestBody List<Member> membersList) {
		  
		  return memberservice.saveNewMember(membersList);
	  }
	  
	  @GetMapping("/greeting")
	  public String greetings() {
		  return "Hello How are you?";
	  }

	  @GetMapping("/members/{id}")
	  public Optional<List<Member>> getMembersByFamilyId(@PathVariable String id) {
		  
		  Optional<List<Member>> familyList = Optional.of(memberservice.getMembersByFamilyId(id).orElseThrow(()-> new MemberNotFoundException(id)));
					  return familyList;
	  }
	  @PutMapping("/members/{id}")
	  public List<Member> updateMembersByFamilyId(@PathVariable String id,@RequestBody List<Member> membersList) {
		  
		 memberservice.updateMembersByFamilyId(membersList,id);
					  return membersList;
	  }
	  @PutMapping("/members/relation/{id}")
	  public List<Member> updateMembersByRelation(@PathVariable String id,@RequestBody List<String> relationList) {
		  
		return memberservice.updateMembersByRelation(relationList,id);
	  }


}
