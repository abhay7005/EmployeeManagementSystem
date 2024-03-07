package ems;

import java.util.Scanner;

public class DisplayScreen {
	static char ch;
	public static void main(String[] args) {
		do {
			System.out.println("           Welcome To Employee Management System");
			Scanner sc = new Scanner(System.in);
			System.out.println("                  Please select Menu No." + "\n");
			System.out.println(" 1.Add New Employee(Create)      2.Display All Employee Data(Read)" + "\n");
			System.out.println(" 3.Update Employee Data          4.Delete Employee Data");
			System.out.println("                       5. Exit");
			int option = sc.nextInt();
			SwitchCase sc1 = new SwitchCase();
			sc1.switchCase(option);
			System.out.println("For Return to Home Page ??? Press 'Y' or 'y' ");
			ch = sc.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
	}
}
