package lab;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {

	public static void main(String[] args) {
		String myString= " public static setName(){}" ;
//		String pattern = "setName";
//    	String pattern = "public\s[a-zA-Z]*\ssetName";
		String pattern = "(if\s\\(\s\\)\s{*})";
		
		
		finder(myString,pattern);
		
	}
	
	
	static void finder( String myString, String pattern) {
		Pattern p = Pattern.compile(pattern);
		Matcher matcher = p.matcher(myString);
		
		while (matcher.find()) {
			if(matcher.group().length() !=0) {
				System.out.println("I found it!\n" + "Start:" +matcher.start()+"  ,Slut:" +matcher.end());
				
			}
//			  System.out.println("I do not find!");
	
		}
		
		
		
	}

}
