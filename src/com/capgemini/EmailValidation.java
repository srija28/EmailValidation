package com.capgemini;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class EmailValidation {
	Scanner sc = new Scanner(System.in);

	public void emailValidator() {
		System.out.println("Enter your email");
		String email = sc.next();
		Pattern pattern = Pattern.compile("^abc.*$");
		Matcher matcher = pattern.matcher(email);
		Boolean matchFound = matcher.find();
		if (matchFound) {
			System.out.println("Email is Validated");
		} else {
			System.out.println("Please check your input");
		}
	}

	public static void main(String[] args) {

		System.out.println("Welcome to the page");
		EmailValidation e = new EmailValidation();
		e.emailValidator();
	}

}
