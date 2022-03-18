/* How to remove all white spaces from a String in Java?
        Difficulty Level : Basic
        Last Updated : 07 Nov, 2018
        Given a String with white spaces, the task is to remove all white spaces from a string using Java built-in methods.

        Examples:

Input: str = "       Geeks     for    Geeks   "
Output: GeeksforGeeks

Input:  str = "    A  Computer  Science   Portal"
Output: AComputerSciencePortal
 */
package com.company;

public class Blank_Space {
    public static void main(String[] args) {
        System.out.println("Remove all the blank spaces : ");
        String str = "   Geeks   for Geeks   ";
        //Call the replace all the method
        str = str.replaceAll("\\s","");
        System.out.println(str);
    }
}
