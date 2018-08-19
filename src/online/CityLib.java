/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online;

import java.util.*;

/**
 *
 * @author Aman Nautiyal
 */
public class CityLib {

    static private class Vertex {

        int x;
        int con[];

        public Vertex(int a) {
            x = a;
        }

        @SuppressWarnings("empty-statement")
        void addCon(int a) {
            if (con == null) {
                con = new int[1];
                con[0] = a;
            } else {
                //System.out.println(con.length);
                int cop[] = new int[con.length];
                for(int i=0;i<con.length;i++)
                    cop[i]=con[i];
               // System.out.println(con.length+1);
                con=new int[cop.length+1];
                for(int i=0;i<cop.length;i++)
                    con[i]=cop[i];
                con[con.length - 1] = a;
            }
        }

        int[] getCon() {
            return con;
        }
    }
    static int dft(Vertex[] vertexList,boolean[] visited,int a)
    {
      if(visited[a])
        return 0;
      int ar[]=vertexList[a].getCon();
      if(ar==null)
          return 1;
      int c=1;
      visited[a]=true;
      for(int i=0;i<ar.length;i++)
          c+=dft(vertexList,visited,ar[i]);
      return c;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            int n = in.nextInt();
            int m = in.nextInt();
            long x = in.nextLong();
            long y = in.nextLong();
            Vertex vertexList[]=new Vertex[n];
            for(int i=0;i<n;i++){
                vertexList[i]=new Vertex(i);
            }
                
            for (int a1 = 0; a1 < m; a1++) {
                int city_1 = in.nextInt();
                int city_2 = in.nextInt();
                vertexList[city_1-1].addCon(city_2-1);
                vertexList[city_2-1].addCon(city_1-1);
            }
            if (x < y || m==0) {
                System.out.println(x * n);
                continue;
            }
            boolean visited[]=new boolean[n];
            for(int i=0;i<n;i++)
                visited[i]=false;
            int cc;
            long sum=0;
            for(int i=0;i<n;i++)
            {
              if(visited[i]==true)
                  continue;
              cc=dft(vertexList,visited,i);
              sum+=(x+y*(cc-1));
            }
         System.out.println(sum);
        }
    }
}
