/*
Check Permutation: Given two strings, write a method to decide if one is a permutation of the 
other. 
*/
import java.util.*;

public class CheckPermutation
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		CheckPermutation obj = new CheckPermutation();
		String s1 = s.nextLine();
		String s2 = s.nextLine();
		System.out.print(obj.checkPermutation(s1,s2));
	}
	boolean checkPermutation (String s1, String s2){
	    char[] s1_char = s1.toCharArray();
	    char[] s2_char = s2.toCharArray();
	    Arrays.sort(s1_char);
	    Arrays.sort(s2_char);
	    if(Arrays.equals(s1_char,s2_char))
	        return true;
	    else 
	        return false;
	}
}
/*
runtime: o(nlong), n = char array length
space = o(2n)= o(n)
*/