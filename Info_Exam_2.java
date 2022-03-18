package com.company;

import java.util.*;

public class Info_Exam_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        char s[]= str.toCharArray();

        String ans = "";
        int no= -1;
        for(int i=0; i<s.length; i++){
            if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u'){
                ans+=s[i];
            }
        }
        char s1[] = ans.toCharArray();
        Arrays.sort(s1);
        if(ans.length()==0){
            ans+="N";
            ans+="A";
        }
        for(int i=0; i<s.length; i++){
            if(s1[0]==s[i]){
                no=i;
            }
        }

        String ans2 ="";
        int no2=-1;
        for(int i=0; i<s.length; i++){
            if(s[i]!='a' && s[i]!='e' && s[i]!= 'i' && s[i] != 'o' && s[i] !='u'){
                ans2+=s[i];
            }
        }
        char s2[] = ans2.toCharArray();
        Arrays.sort(s2);
        if(ans2.length()==0){
            ans+="N";
            ans+="A";
        }
        for(int i=0; i<s.length; i++) {
            if (s2[s2.length - 1] == s[i]) {
                no2 = i;
            }
        }

        System.out.print(s1);
        System.out.print(no);
        System.out.print(s2);
        System.out.println(no2);
    }
}
