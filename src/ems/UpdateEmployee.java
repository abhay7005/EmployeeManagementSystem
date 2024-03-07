package ems;

import java.util.Scanner;

public class UpdateEmployee extends CreateData {
	protected UpdateEmployee(int num1) {
		super(num1);
	}

	Scanner sc = new Scanner(System.in);

	public void update() {
		boolean found = false;
		for (int i = 0; i < num1; i++) {
			if (db[i].getEmployeeCode() == num1) {
				System.out.println("please Select Menu");
				System.out.println("1. New Employee Code");
				System.out.println("2. New Employee Name");
				System.out.println("3. New Employee Department");
				int option = sc.nextInt();
				switch (option) {
				case 1:
					System.out.println("Enter Employye New Employee Code");
					int empCode = sc.nextInt();
					db[i].setEmployeeCode(empCode);
					break;
				case 2:
					System.out.println("Enter Employye New Name");
					String name = sc.next();
					db[i].setEmployeeName(name);
					break;
				case 3:
					System.out.println("Enter Department");
					String dep = sc.next();
					db[i].setEmployeeDepa(dep);
					break;
				case 4:
					System.out.println(" Update All Data E.code/E.Name/E.Depm");
					System.out.println("Enter Employye New Employee Code");
					int empCode1 = sc.nextInt();
					db[i].setEmployeeCode(empCode1);
					System.out.println("Enter Employye New Name");
					String name1 = sc.next();
					db[i].setEmployeeName(name1);
					System.out.println("Enter Department");
					String dep1 = sc.next();
					db[i].setEmployeeDepa(dep1);
				default:
					System.out.println("Employee details updated successfully.");
				}
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Employee with ID " + num1 + " not found.");
		}
	}

}
