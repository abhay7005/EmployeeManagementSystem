package ems;

public class Displaydata extends CreateData {

	protected Displaydata(int num1) {
		super(num1);
		// TODO Auto-generated constructor stub
	}
	public void readData() {
		System.out.println("           Employee Management System");
		System.out.println("_______________________________________________________");
		System.out.println("| Employee Code | Employee Name | Employee Department |");
		System.out.println("-------------------------------------------------------");
		for (int i = 0; i < num1; i++) {
			System.out.println(db[i]);
			System.out.println("-------------------------------------------------------");
		}
		System.out.println("______________________!!! Thank You !!!____________________");
	}
}