/**
String Rotation: Assume you have a method i5Substring which checks ifone word is a substring 
of another. Given two strings, 51 and 52, write code to check if 52 is a rotation of 51 using only one 
call to isSubstring (e.g., Uwaterbottleuis a rotation ofuerbottlewatU).
 */
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Main obj = new Main();
		String s1 = s.nextLine();
		String s2 = s.nextLine();
		boolean output = false;
		if(s1.length()==s2.length() && s1.length()>0)
		    output = obj.stringRotation(s1,s2);
		System.out.println(output);
	}
	
	boolean stringRotation(String s1,String s2){
	    StringBuilder s = new StringBuilder(s1.length()*2);
	    s.append(s1+s1);
	    if(s.indexOf(s2)!=-1)
	        return true;
	    return false;
	}
}
/**
Solution:
boolean i5Rotation(String 51, String 52) { 
int len = sl.length(); 
//Check that 51 and 52 are equal length and not empty 
if (len == s2.length() && len> 8) { 
// Concatenate 51 and sl within new buffer 
String 5151 = 51 + 51; 
return isSubstring(slsl, 52); 
} 
return false; 
}
*/