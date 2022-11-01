/*
Check Permutation: Given two strings, write a method to decide if one is a permutation of the 
other. 
*/
//My Solution :1
/*
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
//runtime: o(nlong), n = char array length
//space = o(2n)= o(n)
*/
//My Solution :2

import java.util.*;
public class CheckPermutation
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		CheckPermutation obj = new CheckPermutation();
		String s1, s2;
		s1 = s.nextLine();
		s2 = s.nextLine();
		if(s1.length()==s2.length())
		    System.out.println(obj.checkPermutation(s1,s2));
		else
		    System.out.println("Not a permutation");
		
	}
	boolean checkPermutation(String s1, String s2){
	    HashMap<Character,Integer> h = new HashMap<Character,Integer>();
	    int i;
	    for(i=0;i<s1.length();i++){
	        if(h.get(s1.charAt(i))==null){
	            h.put(s1.charAt(i),1);
	        }
	        else    
	            h.put(s1.charAt(i),h.get(s1.charAt(i))+1);
	    }
	    for(i=0;i<s1.length();i++){
	        if(h.get(s2.charAt(i))==null){
	            return false;
	        }
	        else    
	        {
	            if(h.get(s2.charAt(i))>0)
	                h.put(s2.charAt(i),h.get(s2.charAt(i))-1);
	            else
	                return false;
	        }
	    }
	    return true;
	}
	
}

//runtime: o(n), n = char array length
//space = o(n)


/*
Solution:
boolean permutation(String s, String t) { 
if (s.lengthO != t.lengthO) { 
return false ; 
} 

int[] letters = new int[128]; II Assumption 

char[] s_array = s.toCharArray(); 
for (char c : s_array) { II count number of each char i n s. 
 letters[c]++; 
 } 
 
 for (int i = e; i < t.length(); i++) { 
 int c = (int) t . charAt(i)j 
 letters[c] --; 
 if (letters[c] < 0) { 
 return false; 
 } 
 } 
 
 return true; 
 } 
*/