/*
Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you 
cannot use additional data structures?
*/
import java.util.*;
public class IsUnique
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		IsUnique obj = new IsUnique();
		int result = obj.isUnique(input);
		System.out.println(result);
		
	}
	
	int isUnique(String input){
	    Hashtable<Character,Integer> h = new Hashtable<Character,Integer>();
		
		for(int i =0;i<input.length();i++){
		    if(h.get(input.charAt(i))==null){
		        h.put(input.charAt(i),1);
		    }
		    else{
		        return -1;
		    }
		}
		return 0;
	}
}
