package ems;

import java.util.Scanner;

public class SwitchCase  {


	public void switchCase(int option) {
		Scanner sc = new Scanner(System.in);
		switch (option) {

		case 1:
			System.out.println("Please Enter The  Number of Employee's data you want to add-: ");
			int num1 = sc.nextInt();
			CreateData cd = new CreateData(num1);
			cd.create();
			break;

		case 2:
			System.out.println("Please Enter The  Number of Employee's data you want to Display-: ");
			int num2 = sc.nextInt();
			Displaydata d1 = new Displaydata(num2);
			d1.readData();

			break;
		case 3:
			System.out.println("Please Enter The Employee's code-: ");
			int num3 = sc.nextInt();
			UpdateEmployee ue=new UpdateEmployee(num3);
			ue.update();
			break;
		case 4:
			System.out.println("Please Enter The Employee's code to Delete Data-: ");
			int num4 = sc.nextInt();
			DeleteData dd=new DeleteData(num4);
			dd.Delete();
			break;
		case 5:
			System.out.println("Log-Out from Current Session");
			break;
		case 6:
			System.out.println("Invalid Option");
		}
	}
}
