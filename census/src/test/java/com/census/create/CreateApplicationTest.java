/**
 * 
 */
package com.census.create;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.census.exception.EmptyFieldException;
import com.census.exception.HeadValidationException;
import com.census.exception.MemberValidationException;


/**
 * @author sonal
 *
 */
class CreateApplicationTest {
	
	private CreateApplication createApplicationTest;
	
	@BeforeEach
	void setup() {
	        createApplicationTest=new CreateApplication();
	}

	@Test
	void should_ThrowArithmeticException_When_AnyFieldIsEmpty() {
		//given
		String headFirstName="a";
		String headLastName="b";
		String headSuffix="c";
		LocalDate headDob=null;
		String headGender="d";
		// when
		  Executable executable=()->createApplicationTest.addHeadMembers(headFirstName, headLastName, headSuffix, headDob, headGender);
		 //then
		 assertThrows(EmptyFieldException.class,executable);
				  
		           
		}
		

}
