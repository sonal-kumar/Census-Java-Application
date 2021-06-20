package com.census.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.census.create.CreateApplication;
import com.census.exception.EmptyFieldException;
import com.census.exception.HeadValidationException;
import com.census.exception.MemberValidationException;
import com.census.members.Members;

public class SampleApplication {

	public static void main(String[] args) {
		String headFirstName="";
		String headLastName="";
		String headSuffix="";
		LocalDate headDob=null;
		String headGender="";
		CreateApplication createApplication=new CreateApplication();
		Scanner sc= new Scanner(System.in);
		System.out.println("headFirstName:");
		headFirstName=sc.nextLine();

		System.out.println("headLastName:");
		headLastName=sc.nextLine();

		System.out.println("headSuffix:");
		headSuffix=sc.nextLine();

		System.out.println("headDOB (M/d/yyyy):");
		String userInput=sc.nextLine();
	    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
	    headDob = LocalDate.parse(userInput, dateFormat);

	    System.out.println("headGender:");
	    headGender=sc.nextLine();
	     try {
			createApplication.addHeadMembers(headFirstName,headLastName,headSuffix,headDob, headGender);
		} catch (HeadValidationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (EmptyFieldException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (MemberValidationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    int op;
		   System.out.println("Enter 1 for adding membe 2 for exit");
		   op= sc.nextInt();
	    while(op==1){
	    	String mFirstName="";
			String mLastName="";
			String mSuffix="";
			LocalDate mDob=null;
			String mGender="";  
			
			System.out.println("FirstName:");
			mFirstName=sc.next();
			
			System.out.println("LastName:");
			mLastName=sc.next();
			System.out.println("Suffix:");
			mSuffix=sc.next();
			System.out.println("DOB (M/d/yyyy):");
			String dob=sc.next();
		    mDob = LocalDate.parse(dob, dateFormat);
		    System.out.println("Gender:");
		    mGender=sc.next();
		    try {
				createApplication.addMembers(mFirstName, mLastName, mSuffix, mDob, mGender,false);
			} catch (MemberValidationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			   System.out.println("Enter 1 for adding membe 2 for exit");
			   op= sc.nextInt();
	   }

		createApplication.saveAndExit();
		System.out.println("Application Id:"+createApplication.getApplicationId());
		
		List<Members> members=createApplication.getMembers();
		
		
		 
		sc.close();
		
	}

}
