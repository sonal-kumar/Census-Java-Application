/**
 * 
 */
package com.sapient.resttraining.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.resttraining.entity.Member;
import com.sapient.resttraining.exception.MemberNotFoundException;
import com.sapient.resttraining.repository.MemberRepository;

/**
 * @author admi
 *
 */
@Service
public class MemberService {
	@Autowired
	private MemberRepository memberrepository;

	public List<Member> findAllMembers() {
		// TODO Auto-generated method stub
		return  memberrepository.findAll();
		
	}

	public List<Member> saveNewMember(List<Member> membersList) {
		// TODO Auto-generated method stub
		String familyId= UUID.randomUUID().toString();;
		for(int i=0;i<membersList.size();i++)
		{
			if (i==0)
			{
				membersList.get(i).setIsHead(true);
				membersList.get(i).setRelationBetween("self");
			}else
			{
				membersList.get(i).setIsHead(false);
				
			}
			membersList.get(i).setFamilyId(familyId);
		}
		
		memberrepository.saveAll(membersList);
		return membersList;
	}

	public Optional <List <Member>> getMembersByFamilyId(String familyId) {
		// TODO Auto-generated method stub
		Optional<List<Member>> member =memberrepository.findByFamilyId(familyId);
		return member;
	}
	public List<Member> updateMembersByFamilyId(List<Member> membersList,String id) {
		// TODO Auto-generated method stub
		List<Member> orgMember =memberrepository.findByFamilyId(id).orElseThrow( ()-> new MemberNotFoundException(id));
		
		for(int i=0;i<membersList.size();i++)
		{
            //orgMember.get(i).setFamilyId(id);
            //orgMember.get(i).setId(membersList.get(i).getId());
			orgMember.get(i).setFirstName(membersList.get(i).getFirstName());
			orgMember.get(i).setLastName(membersList.get(i).getLastName());
			orgMember.get(i).setMiddleName(membersList.get(i).getMiddleName());
			orgMember.get(i).setSuffix(membersList.get(i).getSuffix());
			orgMember.get(i).setDob(membersList.get(i).getDob());
			orgMember.get(i).setGender(membersList.get(i).getGender());
			orgMember.get(i).setRelationBetween(membersList.get(i).getRelationBetween());

		}
		return memberrepository.saveAll(orgMember);
		
	}

	public  List<Member> updateMembersByRelation(List<String> relationList, String id) {
		List<Member> orgMember =memberrepository.findByFamilyId(id).orElseThrow( ()-> new MemberNotFoundException(id));
		orgMember.get(0).setRelationBetween("self");
		for(int i=0;i<relationList.size();i++)
		{
 
				orgMember.get(i+1).setRelationBetween(relationList.get(i));

		}
		return memberrepository.saveAll(orgMember);
		// TODO Auto-generated method stub
		
	}

	
}
