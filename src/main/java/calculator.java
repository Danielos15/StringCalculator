package calculator;

public class calculator {
	
	public static int add(String text) {
		String delimeter = getDelimiter(text);
		text = clean(text);
		if (text.equals("")) {
			return 0;
		} else {
			text = text.replace("\n", delimeter);
			String []numbers = text.split(delimeter);
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
	
	private static String getDelimiter(String input) {
		if (input.startsWith("//")) {
			return input.substring(2,3);
		}
		return ",";
	}
	
	private static String clean(String input) {
		if (input.startsWith("//")) {
			return input.substring(3);
			
		}
		return input;
	}
}