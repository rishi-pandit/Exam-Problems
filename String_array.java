package com.company;

public class String_array {
    public static void main(String[] args) {
        String arr[]={"apple", "mango","pineapple","strawberry"};
        int k = arr.length;
        int count =0;

        for(int i=0; i<k; i++){
           char [] s= arr[i].toCharArray();
           for(int j=0; j<s.length;j++){

                   if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u') {
                       count++;
                   }

           }

            System.out.println(count);
        }
    }
}
