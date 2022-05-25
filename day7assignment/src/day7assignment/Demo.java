package day7assignment;

public class Demo {
	public static Bank getBank(String bank) {

		Bank whichBank = null;

		if (bank == "axis") {

			whichBank = new AxisBank();
			AxisBank ban = (AxisBank) whichBank;

		} else if (bank == "icici") {

			whichBank = new ICICIBank();

		}

		return whichBank;

	};

	public static void main(String[] args) {
		
	}
}
