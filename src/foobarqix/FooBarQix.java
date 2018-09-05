package foobarqix;

public class FooBarQix {
	private static int[] toBeReplaced = {3, 5, 7};

	public String compute(String number) {
		String result = number;
			if(!(divisibleReplacement(number).isEmpty()) || !(containsReplacement(number).isEmpty())) {
				result = divisibleReplacement(number) + containsReplacement(number);
			}
		return result;
	}
	private String divisibleReplacement(String number) {
		String divisible = "";
		for(int replacee : toBeReplaced){
			if(Integer.parseInt(number) % replacee == 0) {
				divisible += replacement(replacee);
			}
		}
		return divisible;
	}
	private String containsReplacement(String number) {
		String contains = "";
		String[] digits = number.split("");
		for(int replacee : toBeReplaced) {
			for(String digit : digits) {
				if(digit.equals(Integer.toString(replacee))) {
					contains += replacement(replacee);
				}
			}
		}
		return contains;
	}
	private String replacement(int replacee) {
		String replacement = "";
		switch(replacee) {
		case 3:
			replacement = "Foo";
			break;
		case 5:
			replacement = "Bar";
			break;
		case 7:
			replacement = "Qix";
			break;
		}
		return replacement;
	}
}