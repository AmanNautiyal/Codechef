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
public class SameOccur 
{
 public static void main(String args[]) throws IOException 
 {
  BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
  String str=Br.readLine();
  String tokens[]=str.split("[ ]+");
  int n=Integer.parseInt(tokens[0]);
  int q=Integer.parseInt(tokens[1]);
  int arr[]=new int[n];
  str=Br.readLine();
  tokens=str.split("[ ]+");
  for(int i=0;i<n;i++)
      arr[i]=Integer.parseInt(tokens[i]);
  int x,y,ct,lmr=0;
  for(int i=0;i<q;i++)
  {
    str=Br.readLine();
    tokens=str.split("[ ]+");
    x=Integer.parseInt(tokens[0]);
    y=Integer.parseInt(tokens[1]);
    ct=0;
    lmr=0;
    int a=0,b=0,temp;
    int tcount=0,totcount=1;
    for(int j=0;j<n;j++)
    {
     ct=0;
     for(int k=j;k<n;k++)
     {
      if(arr[k]==x)
        ct++;
      if(arr[k]==y)
        ct--;
      if(lmr==0 && ct==0)
        a++;
      else if(lmr==0 && ct!=0)
        lmr=1;
      else if(lmr==1 && ct==0)
       lmr=2;
      else if(lmr==2 && ct==0)
          b++;
      else if(lmr==2 && ct!=0)
      {
       tcount+=
      }
     }
     
     
    }
        
  }
 }
}
