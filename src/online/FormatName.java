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
public class FormatName{
    public static void main(String[] args) throws IOException{
      BufferedReader Br= new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(Br.readLine());
        for(int i=0;i<t;i++){
            String str=Br.readLine();
            String words[]=str.split("[ ]+");
            for(int j=0;j<words.length-1;j++)
            {
                char ch='A';
                System.out.print(Character.toUpperCase(words[j].charAt(0))+". ");
            }
            words[words.length-1]=words[words.length-1].toLowerCase();
            System.out.println(Character.toUpperCase(words[words.length-1].charAt(0))+words[words.length-1].substring(1));
        }
    }
}
