/**
 * 
 */
package com.sapient.resttraining.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Columns;


/**
 * @author admi
 *
 */
@Entity
public class Member {
	@Id
	@GeneratedValue
	private int id;
//	
	
//	@Column(name = "memberId")
//	private String memberId;
	
	@Column(name = "familyId")
	private String familyId;
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "middleName")
	private String middleName;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "suffix")
	private String suffix;
	@Column(name = "dob")
	private LocalDate dob;
	
	@Column(name = "gender")
	private String gender; 
	
	@Column(name = "isHead")
	private Boolean isHead;
	
	@Column(name = "relationBetween")
	private String relationBetween;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the memberId
	 */
//	public String getMemberId() {
//		return memberId;
//	}
//
//	/**
//	 * @param memberId the memberId to set
//	 */
//	public void setMemberId(String memberId) {
//		this.memberId = memberId;
//	}

	/**
	 * @return the familyId
	 */
	public String getFamilyId() {
		return familyId;
	}

	/**
	 * @param familyId the familyId to set
	 */
	public void setFamilyId(String familyId) {
		this.familyId = familyId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the suffix
	 */
	public String getSuffix() {
		return suffix;
	}

	/**
	 * @param suffix the suffix to set
	 */
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	/**
	 * @return the dob
	 */
	public LocalDate getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the isHead
	 */
	public Boolean getIsHead() {
		return isHead;
	}

	/**
	 * @param isHead the isHead to set
	 */
	public void setIsHead(Boolean isHead) {
		this.isHead = isHead;
	}

	/**
	 * @return the relationBetween
	 */
	public String getRelationBetween() {
		return relationBetween;
	}

	/**
	 * @param relationBetween the relationBetween to set
	 */
	public void setRelationBetween(String relationBetween) {
		this.relationBetween = relationBetween;
	}

	
	
}