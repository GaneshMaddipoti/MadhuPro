package Practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionEx {
	public static void main(String[] args) {
		
		String input = "test123@abc.com";
		
		Pattern p = Pattern.compile("^(\\w+@?\\w+.?[a-z]+{3})");
		Matcher m = p.matcher(input);
		if(m.find()){
			System.out.println("true");
		}
		else{
			System.out.println("not true");
		}
	}
}
