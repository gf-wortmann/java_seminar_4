package org.example.HomeTask_2;

import java.util.ArrayDeque;

/*
This class is the home task #2 for Geek Brains java beginner's seminar #4
It implements one problem published here:
https://leetcode.com/problems/valid-parentheses/

 */
/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

        An input string is valid if:

        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.
        Every close bracket has a corresponding open bracket of the same type.

 */
public class Main {
    public static void main ( String[] args ) {
        String input1 = "{}[]()";
        String input2 = "()[]{}";
        String input3 = "(]";
        Boolean check1 = isValid ( input1 );
        Boolean check2 = isValid ( input2 );
        Boolean check3 = isValid ( input3 );
        System.out.println ( "check1 = " + check1 );
        System.out.println ( "check2 = " + check2 );
        System.out.println ( "check3 = " + check3 );
    }

    public static boolean isValid ( String s ) {
        ArrayDeque < Character > brackets = new ArrayDeque <> ( );
        for ( char c : s.toCharArray ( ) ) {
            switch ( c ) {
                case '(':
                case '[':
                case '{':
                    brackets.push ( c );
                    break;
                case ')':
                    if ( brackets.isEmpty ( ) || brackets.peek ( ) != '(' ) return false;
                    else brackets.pop ( );
                    break;
                case '}':
                    if ( brackets.isEmpty ( ) || brackets.peek ( ) != '{' ) return false;
                    else brackets.pop ( );
                    break;
                case ']':
                    if ( brackets.isEmpty ( ) || brackets.peek ( ) != '[' ) return false;
                    else brackets.pop ( );
                    break;
                default:
            }
        }
        return brackets.isEmpty ( );
    }
}
