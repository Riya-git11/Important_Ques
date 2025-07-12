package org.example;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

import static java.lang.Math.getExponent;
import static java.lang.Math.max;


class Main {
    public static void main(String args[]) {
       String s = "abcddcbef";  //abcd
       int l=0,e=0;  int maxlength=0;
       Set<Character> st = new LinkedHashSet<>();  int i=0;
       while(e<s.length()){
           char m = s.charAt(e);
           if(!st.contains(m)){
               st.add(m);
               e++;
               maxlength = Math.max(maxlength,e-l);
           }
           else{
               st.remove(s.charAt(l));
               l++;
           }
       }

        StringBuilder sb = new StringBuilder();
        for (char ch : st) {
            sb.append(ch);
        }
        System.out.println(sb.toString());
    }
}





