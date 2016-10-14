package calculator;

public class calculator {
	
	public static int add(String text) {
		if (text.equals("")) {
			return 0;
		} else if (text.contains(",")) {
			String []numbers = text.split(",");
			return sumOf(numbers);
		} else {
			return 1;
		}
	}
	
	private static int sumOf (String []numbers) {
		int total = 0;
		for (String item : numbers) {
			total += toInt(item);
		}
		return total;
	} 
	private static int toInt (String input) {
		return Integer.parseInt(input);
	}
}