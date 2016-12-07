package constitution;

public class ArabicToRoman {
	
	private static final int arabic[] = {10, 5, 1};
	private static final char roman[] = {'X', 'V', 'I'};

	 

	public static String changetoroman(int number)
	{
	int i = 0; 
	 
	String result = "";
	 	
		while ((number > 0) && (i <arabic.length))
		{
			if(number >= arabic[i])
			{
				number -= arabic[i];
				result += roman[i];
			}
			else if ((i%2 == 0) &&
					(i<arabic.length-2) && 
					(number >= arabic[i] - arabic[i+2]) &&
					(arabic[i+2] != arabic[i] - arabic[i+2]))
			{
				number -= arabic[i] - arabic[i+2];
				result += roman[i+2];
				result += roman[i];
				i++;
			}
			else if ((i%2 == 1) &&
					(i<arabic.length-1) &&
					(number >= arabic[i] - arabic[i+1]) &&
					(arabic[i+1] != arabic[i] - arabic[i+1]))
			{
				number -= arabic[i] - arabic[i+1];
				result += roman[i+1];
				result += roman[i];
				i++;
			}
			else
			{
				i++;
			}
		}
	 	
	
	return result;
	
	}	
	
	
}
