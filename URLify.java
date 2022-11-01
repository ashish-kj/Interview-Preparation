/*
URLify: Write a method to replace all spaces in a string with '%2e: You may assume that the string 
has sufficient space at the end to hold the additional characters, and that you are given the "true" 
length of the string. (Note: if implementing in Java, please use a character array so that you can 
perform this operation in place.) 
EXAMPLE 
Input: "Mr John Smith JJ, 13 
Output: "Mr%2eJohn%2eSmith"
*/
import java.util.*;
public class URLify
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		URLify obj = new URLify();
		
		String input = s.nextLine();
		int index = s.nextInt();
		char[] output = obj.urlify(input,index);
		System.out.println(output);
	}
	
	char[] urlify(String input, int index){
	    
	    char[] inp = input.toCharArray();
	    int i,j;
	    
	    for(i=index-1,j=inp.length-1;i>=0;i--,j--){
	        if(inp[i]!=' '){
	            inp[j]=inp[i];
	        }
	        else{
	            inp[j]='0';
	            inp[--j]='2';
	            inp[--j]='%';
	        }
	    }
	    
	    return inp;
	    
	}
}

//runtime = O(n) ; n is the string length
//space = O(n)

/*
Solution:
void replaceSpaces(char[] str, int trueLength) { 
    int spaceCount = e, index, i = 0; 
    for (i = ej i < trueLengthj i++) { 
        if (str[i] == ' ') { 
            spacecount++; 
        }
    }
index = trueLength + spaceCount * 2j 
if (trueLength < str.length) str[trueLength] = '\0'; // End array
for (i = trueLength - 1; i >= 0; i --) { 
    if (str[i] == ' ') { 
        str[index - 1] '0'; 
        str[index - 2] = '2'; 
        str[index - 3] = '%';
        index = index - 3; 
    } else { 
        str[index - 1] = str[i]; 
        index--; 
        }
    }
}
*/