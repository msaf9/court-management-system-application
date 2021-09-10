package com.app.courtsystem;

public class Hearings extends CourtSystemApp {
	void hearings() {
		int noh;
		System.out.println("::Hearings::");
		System.out.print("Number of hearings done:");
		noh = sc.nextInt();
		if (noh >= 3) {
			System.out.println("::The status of the case::");
			System.out.println("CLOSED");
		} else if (noh == 0) {
			System.out.println("Meet the lawyer and ask details about 1st hearing.");
			System.out.println("Thank you :)");
		} else if (noh == 1 || noh == 2) {
			System.out.println("Meet the lawyer and give suitable documents & proofs about the case.");
			System.out.println("Thank you :)");
		}
	}
}
