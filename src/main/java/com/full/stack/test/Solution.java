package com.full.stack.test;
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;
import java.util.Map.Entry;
class Solution{
   public static  HashMap<String,Integer> phoneBook=new HashMap<String,Integer>();
    public static void main(String []argh){   
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){    
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name,phone);
        }
        while(in.hasNext()){
             if(phoneBook.containsKey(in.next()))
             {
          System.out.println(in.next()+"="+phoneBook.get(in.next()));    
             }
             System.out.println("Not found");
        }         
        in.close();
    }    
    
}
