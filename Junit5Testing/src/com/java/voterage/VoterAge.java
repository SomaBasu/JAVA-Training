package com.java.voterage;

public class VoterAge {
	public boolean isVoterValid(int age) throws Exception {
		if (age < 0) {
			throw new Exception("Invalid age, Should not be Zero");
		}
		return age >= 18;
	}
}
