package ems;

public class DeleteData extends CreateData {

	protected DeleteData(int num1) {
		super(num1);
		// TODO Auto-generated constructor stub
	}

	public void Delete() {
		boolean found = false;
		for (int i = 0; i < num1; i++) {
			if (db[i].getEmployeeCode() == num1) {
				for (int j = i; j < db.length - 1; j++) {
					db[j] = db[j + 1];
				}
				num1--;
				System.out.println("Employee deleted successfully.");
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Employee with ID " + rn + " not found.");
		}
	}

}
