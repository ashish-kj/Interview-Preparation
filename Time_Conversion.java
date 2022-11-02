//Hacker rank question:Time Conversion
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    String time[] = s.split(":",2);
    String output = "";
    int hour = Integer.parseInt(time[0]);
    String tail = s.substring(2,8);
    if(s.charAt(8)=='A'){
        if(hour==12)
            output+="00"+tail;
        else
            output+= s.substring(0,8);
    }
    else{
        if(hour==12)
            output+= s.substring(0,8);
        else{
            hour+=12;
            output+= Integer.toString(hour)+tail;
        }
    }
    return output;
    }

}

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
