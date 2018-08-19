/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Aman Nautiyal
 */
public class CoinEx {

    static long getWays(long n, long[] c) {
        // Complete this function
      Arrays.sort(c);
      long ways=perf(n,c,null);
    }
    static long perf(long n,long[] c,long pop[])
    {
     long ar[]=pop;
     
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] c = new long[m];
        for (int c_i = 0; c_i < m; c_i++) {
            c[c_i] = in.nextLong();
        }
        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'
        long ways = getWays(n, c);
    }
}
