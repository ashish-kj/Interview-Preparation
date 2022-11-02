/**
Palindrome Permutation: Given a string, write a function to check if it is a permutation of 
a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A 
permutation is a rearrangement of letters. The palindrome does not need to be limited to just 
dictionary words. 
EXAMPLE 
Input: Tact Coa 
Output: True (permutations:"taco cat'; "atco cta'; etc.) 

 */
import java.util.*;
public class PalindromePermutation
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		PalindromePermutation obj = new PalindromePermutation();
		String input = s.nextLine();
		input = input.toLowerCase();
		System.out.println(obj.palindromePermutation(input));
	}
	
	boolean palindromePermutation(String input){
	    HashMap <Character,Integer> h = new HashMap<Character,Integer>();
	    int i,oddCount=0;
	    
	    for(i=0;i<input.length();i++){
	        if(input.charAt(i)==' ')
	            continue;
	        if(h.get(input.charAt(i))==null){
	            h.put(input.charAt(i),1);
	        }
	        else{
	            h.put(input.charAt(i),h.get(input.charAt(i))+1);
	        }
	    }
	    for (Map.Entry<Character,Integer> hm : h.entrySet()) {
            int value = hm.getValue();
            if(value%2!=0){
                oddCount++;
            }
        }
	    if(oddCount<=1){
	        return true;
	    }
	    else{
	        return false;
	    }
	}
}

//runtime: o(n); n is the length of the input string
//space complexity:o(n)
/**
Solution:
boolean isPermutationOfPalindrome(String phrase) { 
int bitVector = create||BitVector(phrase) ; 
return bitVector == 0||  checkExactlyOneBitSet(bitVector); 
}
int createBitVector(String phrase) { 
int bitVector = 0; 
for (char c : phrase.toCharArray()) { 
int x = getCharNumber(c); 
bitVector = toggle(bitVector, x); 
} 
return bitVector; 
}
int toggle(int bitVector, int index) { 
if (index < 0) return bitVector; 

int mask = 1 << index; 
if ((bitVector & mask) ==0{
bitVector |= mask; 
} else { 
bitVector &= ~mask; 
} 
return bitVector; 
} 

) {
boolean checkExactlyOneBitSet(int bitVector) { 
return (bitVector & (bitVector - )) == 0; 
}
 */