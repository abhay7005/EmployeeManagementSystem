package ems;

import java.util.Scanner;

public class CreateData {
	static int num1;

	protected CreateData(int num1) {
		super();
		this.num1 = num1;
	}

	public static int maximumEmployee = 100;
	static Employee[] db = new Employee[maximumEmployee];
	static int rn;
	static String nm;
	static String dp;
	Scanner sc = new Scanner(System.in);
	int i = 0;

	public void create() {
		if (num1 < maximumEmployee) {
			while (i < num1) {
				System.out.println("Enter The Employee Code.-:");
				this.rn = sc.nextInt();
				System.out.println("Enter The Employee Name.-:");
				this.nm = sc.next();
				System.out.println("Please Enter the Department Name of " + nm);
				dp = sc.next();
				Employee e1 = new Employee(rn, nm, dp);
				db[i] = e1;
				System.out.println("\n" + " Data Added Succesfully !!!" + "\n" + "\n");
				i++;
//			for (int i = 0; i < db.length; i++) {
//				System.out.println(db[i]);}
			}
		}
	}
}
