/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online;

import java.io.*;
import java.util.*;

/**
 *
 * @author Aman Nautiyal
 */
public class maxgcd {
    public static void main(String args[]) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(Br.readLine());
        String a=Br.readLine();
        String[] ar= a.split("[ ]+");
        String b=Br.readLine();
        String[] br= b.split("[ ]+");
        int A[]=new int[n];
        int B[]=new int[n];
        int max=A[0],min=B[0];
        for(int i=0;i<n;i++)
        {
         A[i]=Integer.parseInt(ar[i]);
         B[i]=Integer.parseInt(br[i]);
         if(A[i]>max)
             max=A[i];
         if(B[i]>max)
             max=B[i];
         if(A[i]<min)
             min=A[i];
         if(B[i]<min)
             min=B[i];
        }
        int i,j,mda,mdb;
        int msum=0,mgcd=0;
        outer:  for(i=max;i>min;i--)
        {
          mda=-1;
          for(j=0;j<n;j++)
          {
              if(A[j]<mgcd)
                  continue outer;
              if((A[j]%i)==0 && (mda==-1 || A[j]>mda))
                  mda=A[j];
          }
          mdb=-1;
           for(j=0;j<n;j++)
          {
              if(B[j]<mgcd)
                  continue outer;
              if((B[j]%i)==0 && (mdb==-1 || B[j]>mdb))
                  mdb=B[j];
          }
          if(mda !=-1 && mdb!=-1)
          { 
              System.out.println(mda+mdb);
              break;
          }
        }
    }
}
