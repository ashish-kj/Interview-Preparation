//Hacker rank question:Camel Case 4
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        List<String> arr = new ArrayList<String>();
        while(s.hasNext()){
            arr.add(s.nextLine());
        }
        
        for(String temp : arr){
            System.out.println(camelCase(temp));
        }
    }
    
    static String camelCase(String input){
        String var = (input.split(";"))[2];
        if(input.charAt(0)=='S')
            return splitVar(var,input.charAt(2));
        else
            return concVar(var,input.charAt(2));
    }
    static String splitVar(String var, char type){
        String retVal="";
        if(type=='C'){
            retVal+=var.charAt(0);
            for(int i=1;i<var.length();i++){
                if(!Character.isUpperCase(var.charAt(i)))
                    retVal+=var.charAt(i);
                else
                    retVal+=" "+var.charAt(i);
            }
        }
        else if(type=='M'){
            for(int i=0;i<var.length()-2;i++){
                if(!Character.isUpperCase(var.charAt(i)))
                    retVal+=var.charAt(i);
                else
                    retVal+=" "+var.charAt(i);
            }
        }
        else{
            for(int i=0;i<var.length();i++){
                if(!Character.isUpperCase(var.charAt(i)))
                    retVal+=var.charAt(i);
                else
                    retVal+=" "+var.charAt(i);
            }
        }
        return retVal.toLowerCase();
    }
    static String concVar(String var, char type){
        String retVal="";
        if(type=='C'){
            retVal+=Character.toString((var.charAt(0)-32));
            for(int i =1;i<var.length();i++){
                if(var.charAt(i)==' '){
                    i++;
                    retVal+=Character.toString((var.charAt(i)-32));
                    continue;
                }
                retVal+=var.charAt(i);
            }
        }
        else if(type=='M'){
            for(int i =0;i<var.length();i++){
                if(var.charAt(i)==' '){
                    i++;
                    retVal+=Character.toString((var.charAt(i)-32));
                    continue;
                }
                retVal+=var.charAt(i);
            }
            retVal+="()";
        }
        else{
            for(int i =0;i<var.length();i++){
                if(var.charAt(i)==' '){
                    i++;
                    retVal+=Character.toString((var.charAt(i)-32));
                    continue;
                }
                retVal+=var.charAt(i);
            }
        }
        return retVal;
    }
}