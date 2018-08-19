/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online;
import java.io.*;
/**
 *
 * @author Aman Nautiyal
 */
public class ChefSign
{
 public static void main(String args[]) throws IOException
 {
  BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
  int t=Integer.parseInt(Br.readLine());
  String s,tokens[];
  int max,min,x;
  char ch;
  for(int i=0;i<t;i++)
  {
   s=Br.readLine();
   max=0;min=0;x=0;
   if(s==null)
       System.out.println(0);
   for(int j=0;j<s.length();j++)
   {
     ch=s.charAt(j);
    switch(ch)
    {
        case '>':
           x--;break;
        case '<':
           x++;break;
        case '=':
            break;
    }
    if(x<min)
        min=x;
    if(x>max)
        max=x;
   }
   x=1-min;
   max+=x;
   System.out.println(max);
  }
 }
}
