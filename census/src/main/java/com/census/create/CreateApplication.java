/**
 * 
 */
package com.census.create;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import com.census.exception.EmptyFieldException;
import com.census.exception.HeadValidationException;
import com.census.exception.MemberValidationException;
import com.census.members.Members;

/**
 * @author sonal
 *
 */
public class CreateApplication {
	private String headFirstName;
	private String headLastName;
	private String headSuffix;
	private LocalDate headDob;
	private String headGender;
	private String applicationId;
	private List<Members> members;
	private HashMap<Members,String> relation;
	private Integer age;
	/**
	 * @return the headFirstName
	 */
	
	public CreateApplication() {
		// TODO Auto-generated constructor stub
		this.members=new ArrayList<Members>();
		
	}
	public String getHeadFirstName() {
		return headFirstName;
	}

	/**
	 * @param headFirstName the headFirstName to set
	 * @throws HeadValidationException 
	 * @throws EmptyFieldException 
	 */
	public void setHeadFirstName(String headFirstName) throws HeadValidationException, EmptyFieldException {
		if(headFirstName.length()==0)
			throw new EmptyFieldException("first name cannot be empty");	
		else if(headFirstName.length()>32)
			throw new HeadValidationException("length of first name is greater than 32");
		else
		this.headFirstName = headFirstName;
	}

	/**
	 * @return the headLastName
	 */
	public String getHeadLastName() {
		return headLastName;
	}

	/**
	 * @param headLastName the headLastName to set
	 * @throws HeadValidationException 
	 */
	public void setHeadLastName(String headLastName) throws HeadValidationException,EmptyFieldException{
		if(headLastName.length()==0)
			throw new EmptyFieldException("last name cannot be empty");	
		else if(headLastName.length()>32)
			throw new HeadValidationException("length of last name is greater than 32");
		else
		this.headLastName = headLastName;
	}

	/**
	 * @return the headSuffix
	 */
	public String getHeadSuffix() {
		return headSuffix;
	}

	/**
	 * @param headSuffix the headSuffix to set
	 * @throws EmptyFieldException 
	 */
	public void setHeadSuffix(String headSuffix) throws EmptyFieldException {
		if(headSuffix.length()==0)
			throw new EmptyFieldException("head suffix cannot be empty");	
		else
		this.headSuffix = headSuffix;
	}

	/**
	 * @return the headDob
	 */
	public LocalDate getHeadDob() {
		return headDob;
	}

	/**
	 * @param headDob the headDob to set
	 */
	public void setHeadDob(LocalDate headDob) throws HeadValidationException,EmptyFieldException {
		if(headDob==null)
		throw new EmptyFieldException("Dob cannot be empty");
		
		this.age = Period.between(headDob, LocalDate.now()).getYears();
	    if(age>125)
			throw new HeadValidationException("Age cannot be more than 125");
		else
		this.headDob = headDob;
	}

	/**
	 * @return the headGender
	 */
	public String getHeadGender() {
		return headGender;
	}

	/**
	 * @param headGender the headGender to set
	 * @throws EmptyFieldException 
	 */
	public void setHeadGender(String headGender) throws EmptyFieldException {
		if(headGender.length()==0)
			throw new EmptyFieldException("head gender cannot be empty");	
		else
		this.headGender = headGender;
	}

	/**
	 * @return the applicationId
	 */
	public String getApplicationId() {
		return applicationId;
	}

	/**
	 * @param applicationId the applicationId to set
	 */
	public void generateApplicationId() {
		this.applicationId =UUID.randomUUID().toString();
	}

	/**
	 * @return the members
	 */
	public List<Members> getMembers() {
		return members;
	}
	
	public void addHeadMembers(String mFirstName,String mLastName,String mSuffix,LocalDate  mDob, String mGender) throws HeadValidationException, EmptyFieldException, MemberValidationException {
             this.setHeadFirstName(mFirstName);
             this.setHeadLastName(mLastName);
             this.setHeadSuffix(mSuffix);
             this.setHeadDob(mDob);
             this.setHeadGender(mGender);
             this.addMembers(mFirstName,mLastName,mSuffix,mDob,mGender,true);
	}

	/**
	 * @param members the members to be added
	 * @throws MemberValidationException 
	 */
	public void addMembers(String mFirstName,String mLastName,String mSuffix,LocalDate  mDob, String mGender,Boolean isHead) throws MemberValidationException {
		if(this.members.size()>=5)
			throw new MemberValidationException("Members cannot be more than 5");
		int mAge = Period.between(mDob, LocalDate.now()).getYears();
		if(mAge>this.age)
			throw new MemberValidationException("Age of Member cannot be more than Head");
		else {
		Members member =new Members(mFirstName,mLastName,mSuffix,mDob,mGender,isHead);
		this.members.add(member);
		}
	}

	/**
	 * @return the relation
	 */
	public HashMap<Members, String> getRelation() {
		return relation;
	}

	/**
	 * @param relation the relation to set
	 */
	public void setRelation(HashMap<Members, String> relation) {
		this.relation = relation;
	}

	/**
	 * 
	 */
public void saveAndExit() {
	this.generateApplicationId();
}


}
