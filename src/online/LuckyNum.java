/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Aman Nautiyal
 */

public class LuckyNum {
    public static void main(String args[]) throws IOException
    {
     BufferedReader Br= new BufferedReader(new InputStreamReader(System.in));
     String str =Br.readLine();
     int num=Integer.parseInt(str);
     int i;
     for(i=num+1;i<=999999;i++)
     {
       if(isLucky(i+""))
           break;
     }
     System.out.println(i);
    }
    static boolean isLucky(String str)
    {
        int arr[]=new int[6];
     for(int i=0;i<str.length();i++)
         arr[i]=Character.digit(str.charAt(i), 10);
     int l=arr[0]+arr[1]+arr[2],r=arr[3]+arr[4]+arr[5];
     if(l==r)
         return true;
     return false;
    }
}
