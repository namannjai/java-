public class Tester1 {
	public boolean checkTemp(int temp) {
		if (temp > 100) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String args[]) {
		Tester1 tester = new Tester1();
		if (tester.checkTemp(110)) {
			System.out.println("Data is valid");
		} else {
			System.out.println("Data is invalid");
		}
	}
}