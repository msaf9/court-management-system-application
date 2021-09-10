package com.app.courtsystem;

import java.util.Scanner;

public class CourtSystemApp {
	int a[] = new int[100], i = 1, fr, nd, si, pr, sw;
	int z[] = new int[7];
	int r[] = new int[4];
	String s;
	Scanner sc = new Scanner(System.in);

	void create() {
		long l, d, p;
		String c, password;
		System.out.println("::Create::");
		System.out.print("Enter your name:");
		sc.nextLine();
		s = sc.nextLine();

		System.out.print("Enter your password in 5-digit:");
		a[i] = sc.nextInt();
		System.out.print("Enter your phone number:");
		p = sc.nextLong();
		System.out.print("Enter your door number:");
		d = sc.nextLong();
		System.out.print("Enter your location/ city:");
		sc.next();
		c = sc.nextLine();
		System.out.println("Your account is created.\nPlease login.");
		menu();
	}

	void menu() {
		int conditionToLoop = 0;
		int j, password, opt, cstype;
		String name, msg, Email, city, lawyer;
		System.out.println("::Here are the options for Court Case Management::");
		int l = 0;

		System.out.println("1.Create Account\n2.Login\n3.Find a Lawyer\n4.Select Case Type\n5.Exit");
		opt = sc.nextInt();
		switch (opt) {
		case 1:
			create();
			break;
		case 2:
			System.out.println("::Login::");
			System.out.print("Please enter your name:");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("Enter your password:");
			password = sc.nextInt();
			for (j = 1; j <= 100; j++) {
				if (password == a[j]) {
					options();
				} else {
					System.out.println("Your password is not correct");
					System.exit(0);
				}
			}
			break;
		case 3:
			while (conditionToLoop != 1) {
				System.out.println("::Find a lawyer::");
				System.out.println("1.Option 1 to continue\n2.Option 2 to Exit");
				int choice = sc.nextInt();

				if (choice == 1) {
					System.out.println("::Provide your details::");
					System.out.print("Enter your name: ");
					sc.nextLine();
					name = sc.nextLine();
					System.out.print("Enter your message: ");
					msg = sc.nextLine();
					System.out.print("Enter your email id: ");
					Email = sc.nextLine();
					System.out.print("Enter your city: ");
					city = sc.nextLine();
					System.out.println("Thank you :)\nA lawyer will get back to you very soon.");
				}

				if (choice == 2) {
					conditionToLoop = 1;
				}
			}

			break;
		case 4:
			int y = 0, op;
			while (y != 1) {
				System.out.println("::Select case type to find a lawyer::");
				System.out.println("1.Civil case\n2.Criminal case");
				cstype = sc.nextInt();
				if (cstype == 1) {
					System.out.println("::Civil lawyers list near your place::");
					System.out.println("1.Ram Jethmalani\n2.Fali Nariman\n3.KK Venugopal\n4.Gopal Subramaniam");
				} else if (cstype == 2) {
					System.out.println("::Criminal lawyers list near your place::");
					System.out.println("1.B.Daniel\n2.Rhyan Ahmed\n3.D.Michael\n4.Charles B.Wagner\n");
				} else {
					System.out.println("Invalid option");

				}
				if (cstype == 1 || cstype == 2) {
					System.out.println("Select your lawyer");
					sc.nextLine();
					lawyer = sc.nextLine();
					System.out.println("We have saved your choice.\nThank you :)");
					System.out.println("Select 1 to continue or 2 to exist");
					op = sc.nextInt();
					if (op != 1) {
						y = 1;
					}
				}
			}
			break;
		case 5:
			System.out.println("Thank you :)\nYou have exited the application.");
			System.exit(0);
		}

	}

	void options() {
		int op;
		int q = 0;
		while (q != 1) {
			System.out.println("::Here are the options for your case::");
			System.out.println("1.Submit proofs\n2.Fill a case \n3.Court fees\n4.Logout");
			op = sc.nextInt();
			switch (op) {
			case 1:
				Submitproofs();
				break;
			case 2:
				fillacase();
				break;
			case 3:
				courtfees();
				break;
			case 4:
				System.out.println("You have logged out succesfully.");
//				System.exit(0);
				q = 1;
				menu();
				break;
			}

		}
	}

	void Submitproofs() {
		int n;
		System.out.println("::Submit proof::");
		System.out.print("Number of proofs:");
		n = sc.nextInt();

		String proof[] = new String[n];
		for (i = 0; i < n; i++) {
			System.out.print("Enter your type of proof:");
			sc.nextLine();
			proof[i] = sc.nextLine();
		}
		System.out.println("Proof submitted.");

	}

	void fillacase() {
		String plaintiff, defendant, courtn, complaint;
		System.out.println("::File a case::");
		System.out.print("Enter the plaintiff name:");
		sc.nextLine();
		plaintiff = sc.nextLine();
		System.out.print("Enter the defendant name:");
		defendant = sc.nextLine();
		System.out.print("Enter the court name:");
		courtn = sc.nextLine();
		System.out.print("Enter nature of complaint:");
		complaint = sc.nextLine();
		System.out.println("Case filed.");
	}

	void courtfees() {
		int f;
		int u = 0;
		while (u != 1) {
			System.out.println("::Available court fees::");
			System.out.println("1.FR\n2.ND\n3.PR\n4.SI\n5.SW\n6.Exit");
			f = sc.nextInt();
			switch (f) {
			case 1:
				System.out.println("In case of plaint /written statement is Rs. 10/- only.");
				break;
			case 2:
				System.out.println("Value of suit exceeds Rs. 1,50,000 - 1,55,000 is Rs. 1700/- only.");
				break;
			case 3:
				System.out.println("Value of suit exceeds Rs. 3,00,000 - 3,05,000 is Rs. 2450/- only.");
				break;
			case 4:
				System.out.println("Value of suit exceeds Rs. 4,00,000 - 4,05,000 is Rs. 2950/- only.");
				break;
			case 5:
				System.out.println("On a copy of a Decree or order is Rs. 0.50/- only.");
				break;
			case 6:
				u = 1;
				menu();
			}
		}

	}
}
