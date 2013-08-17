package helpers;

public class CharArray
{
	public static String ToString(char[] chars)
	{
		String result = MyString.Empty();
		for(char character:chars)
		{
			result = result+character;
		}
		return result;
	}
	


}
