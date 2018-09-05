package foobarqix;

public class FooBarQix {
	private static int[] toBeReplaced = {3, 5, 7};

	public String compute(String number) {
		String result = number;
		for(int replacee : toBeReplaced){
			if(Integer.parseInt(number) % replacee == 0) {
				switch(replacee) {
				case 3:
					result = "Foo";
					break;
				case 5:
					result = "Bar";
					break;
				case 7:
					result = "Qix";
					break;
				}
			}
		}
		return result;
	}
}