package com.census.members;

import java.time.LocalDate;

public class Members {
	
	private String mFirstName;
	private String mLastName;
	private String mSuffix;
	private LocalDate  mDob;
	private String mGender;
	private Boolean isHead;
	
	public Members(String mFirstName,String mLastName,String mSuffix,LocalDate  mDob, String mGender,Boolean isHead) {
		this.mFirstName=mFirstName;
		this.mLastName=mLastName;
		this.mSuffix=mSuffix;
		this.mDob=mDob;
		this.mGender=mGender;
		this.isHead=isHead;
	}
	
	/**
	 * @return the mFirstName
	 */
	public String getmFirstName() {
		return mFirstName;
	}
	/**
	 * @param mFirstName the mFirstName to set
	 */
	public void setmFirstName(String mFirstName) {
		this.mFirstName = mFirstName;
	}
	/**
	 * @return the mLastName
	 */
	public String getmLastName() {
		return mLastName;
	}
	/**
	 * @param mLastName the mLastName to set
	 */
	public void setmLastName(String mLastName) {
		this.mLastName = mLastName;
	}
	/**
	 * @return the mSuffix
	 */
	public String getmSuffix() {
		return mSuffix;
	}
	/**
	 * @param mSuffix the mSuffix to set
	 */
	public void setmSuffix(String mSuffix) {
		this.mSuffix = mSuffix;
	}
	/**
	 * @return the mDob
	 */
	public LocalDate getmDob() {
		return mDob;
	}
	/**
	 * @param mDob the mDob to set
	 */
	public void setmDob(LocalDate mDob) {
		this.mDob = mDob;
	}
	/**
	 * @return the mGender
	 */
	public String getmGender() {
		return mGender;
	}
	/**
	 * @param mGender the mGender to set
	 */
	public void setmGender(String mGender) {
		this.mGender = mGender;
	}

	public Boolean getIsHead() {
		return isHead;
	}

	public void setIsHead(Boolean isHead) {
		this.isHead = isHead;
	}


}
