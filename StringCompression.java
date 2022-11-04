/**
String Compression: Implement a method to perform basic string compression using the counts 
of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the 
"compressed" string would not become smaller than the original string, your method should return 
the original string. You can assume the string has only uppercase and lowercase letters (a - z)
 */
import java.util.*;
public class StringCompression
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringCompression obj = new StringCompression();
		String input = s.nextLine();
		String output = obj.stringCompression(input);
		System.out.println(output);
	}
	
	String stringCompression(String s){
	    int i,counter=1;
	    StringBuilder output= new StringBuilder();
	    for(i=0;i<s.length()-1;i++){
	        if(s.charAt(i)==s.charAt(i+1)){
	            counter++;
	        }
	        else{
	            output.append(s.charAt(i));
	            output.append(counter);
	            counter=1;
	            
	        }
	    }
	    output.append(s.charAt(i));
	    output.append(counter);
	    return output.length() < s.length() ? output.toString() : s; 
	}
	
}
//runtime : o(n) ; n is the length of the string
//space	 complexity	:o(1)
/**
Solution:
String compress(String str) { 
// Check final length and return input string if it would be longer. 
int finalLength = countCompression(str); 
if (finalLength )= str.length()) return str; 

StringBuilder compressed = new StringBuilder(finalLength); II initial capacity 
int countConsecutive = 0; 
for (int i = 0; i < str.length(); i++) { 
countConsecutive++; 
 
// If next character is different than current, append this char to result. 
if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) { 
compressed.append(str.charAt()); 
compressed.append(countConsecutive); 
countConsecutive = 0; 
} 
} 
return compressed.toString(); 
} 

int countCompression(String str) { 
int compressed Length = 0; 
int countConsecutive = 0; 
for (int i = 0; i < str.length(); i++) { 
countConsecutive++; 

// If next character is different than current, increase the length. 
if (i + 1 )= str. length() || str.charAt(i) != str.charAt(i + 1)) { 
compressed Length += 1 + String.valueOf(countConsecutive).length(); 
countConsecutive = 0; 
} 
} 
return compressed Length; 
}
*/