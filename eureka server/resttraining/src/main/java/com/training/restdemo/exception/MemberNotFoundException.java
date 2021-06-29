package com.training.restdemo.exception;

public class MemberNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8018632937608031360L;

	public MemberNotFoundException(Integer id) {
		super("Could not find member " + id);
	}
}