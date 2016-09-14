
public class StringCalculator {
	public int add(String numbersStr) {
		if (numbersStr == null || numbersStr.length() == 0)
			return 0;
		
		numbersStr = numbersStr.replaceAll("\n", ",");
		
		String[] splitNumbers = numbersStr.split(",");
		
		int value = 0;
		for (int i = 0; i < splitNumbers.length; i++)
			value += Integer.valueOf(splitNumbers[i].trim());
		
		return value;
	}
	
	private String reformatNewLines(String str) throws StringCalculatorException {
		int prevIndex = 0;
		
		while (prevIndex != -1) {
			prevIndex = str.indexOf("\n", prevIndex);
			
		}
		
		return str.replaceAll("\n", ",");
	}
}
