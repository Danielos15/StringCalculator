package calculator;

public class calculator {
	
	public static int add(String text) {
		if (text.equals("")) {
			return 0;
		} else {
			text = text.replace("\n", ",");
			String []numbers = text.split(",");
			return sumOf(numbers);
		}
	}
	
	private static int sumOf (String []numbers) {
		int total = 0;
		String neg = "";
		for (String item : numbers) {
			int number = toInt(item);
			if(number < 0) {
				neg += " " + item;
			} else if (number <= 1000) {
				total += number;
			}
		}
		if (neg != "") {
			throw new IllegalArgumentException ("Negatives not allowed:" + neg);
		}
		return total;
	} 
	
	private static int toInt (String input) {
		return Integer.parseInt(input);
	}
}