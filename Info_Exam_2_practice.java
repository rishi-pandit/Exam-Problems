/* Consider a non-empty string instr consisting of only lower case alphabets. Identify and print the string outstr, based on the below logic:

        Identify all the vowels in instr and add them to outstr in lexicographical order

        . Considering the first vowel fvowel in outstr, find the index of the first occurrence of fvowel in instr and append it to outstr

        o If there is no vowel in instr add "NA" and append "-1" in place of index

        Identify all the consonants in instr and append them to outstr in lexicographical order

        Considering the last consonant Iconsonant in outstr, find the index of the last occurrence of Iconsonant in instr and add it to outstr

        If there is no consonant in instr add "NA" and append "-1" in place of index

        Note: Lexicographical order is "abcde....xyz"

        Input format:

        Read instr from the standard input stream.


        Output format

        Print outstr to the standart outpwwwm

        Example-. temperature
aeeeu6mprrtt7
        */

package com.company;
import java.util.*;

public class Info_Exam_2_practice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        char s[] = str.toCharArray();

        String ans ="";
        int no =-1;
        for(int i=0; i<s.length; i++){
            if(s[i]=='a' || s[i]=='e' || s[i]== 'i' || s[i] == 'o' || s[i] == 'u'){
                ans+=s[i];
            }
        }

        char s1[]=ans.toCharArray();
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

        String ans2="";
        int no2=-1;
        for(int i=0; i<s.length; i++){
            if(s[i]!='a' && s[i]!='e' && s[i]!='i' && s[i]!='o' && s[i]!='u'){
                ans2+=s[i];
            }
        }
        char s2[] = ans2.toCharArray();
        Arrays.sort(s2);
        if(ans2.length()==0){
            ans2+="N";
            ans2+="A";
        }
        for(int i=0; i<s.length; i++){
            if(s2[s2.length-1]==s[i]){
                no2=i;
            }
        }
        System.out.print(s1);
        System.out.print(no);
        System.out.print(s2);
        System.out.print(no2);

    }
}
