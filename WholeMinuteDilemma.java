//https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60
import java.util.*;
public class WholeMinuteDilemma
{
	public static void main(String[] args) {
		int time[] = {10, 20, 30, 60, 80, 110, 120};
		WholeMinuteDilemma obj = new WholeMinuteDilemma();
		int res = obj.numPairsDivisibleBy60(time);
		System.out.println(res);
	}
	int numPairsDivisibleBy60(int[] time) {
        int n = time.length, ans = 0;
        int rem, target,i;
        HashMap<Integer, Integer> len = new HashMap<Integer,Integer>();
        for(i  = 0; i < n; i++){
            rem = time[i] % 60;
            target = 60 - (rem);
            if(len.containsKey(target))
                ans += len.get(target);
            if(rem != 0)
                len.put(rem, len.getOrDefault(rem, 0) + 1);
            else
                len.put(60, len.getOrDefault(60, 0) + 1);
        }
        return ans;
    }
}
/*
Solution:
Class Solution{
    public int numPairsDivisibleBy60(int[] time){
        int[] count = new int[60];
        for(int i:time){ count[i%60]++; }

        int pair = 0;

        for(int i=1;i<30;i++){
            pair+= count[i]*count[60-i];
        }

        pair+=sumofN(count[0]-1)+sumofN(count[30]-1);

        return pair;
    }

    int sumofN(int n){
        return n*(n+1)/2;
    }
}
*/