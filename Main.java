package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String");
        String s=sc.nextLine();
        int a=0,e=0,i=0,o=0,u=0,consonants=0;
        for(int k=0; k<s.length(); k++) {
            char ch=s.charAt(k);
            switch (ch) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:
                    consonants++;
                    break;
            }
        }
        int vowelsCount=a+e+i+o+u;
        System.out.println("consonants :"+consonants);
        System.out.println("a value :"+a);
        System.out.println("e value :"+e);
        System.out.println("i value :"+i);
        System.out.println("o value :"+o);
        System.out.println("u value :"+u);
        System.out.println("vowels count :"+vowelsCount);
    }
}
