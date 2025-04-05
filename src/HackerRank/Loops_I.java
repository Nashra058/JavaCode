package HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Solution {
    public static void main(String[] args) throws IOException {
 Scanner sc = new Scanner(System.in);
 int N = sc.nextInt();
 for(int i=1;i<=10;i++){
    int result = N*i;
    System.out.println(N+ " x "+ i + " = " + result);
 }
 
    }