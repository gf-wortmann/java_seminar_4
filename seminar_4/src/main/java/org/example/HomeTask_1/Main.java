package org.example.HomeTask_1;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/* 1)Вывести список на экран в перевернутом виде (без массивов и ArrayList)
        Пример:
        1 -> 2->3->4
        Вывод:
        4->3->2->1
 */
public class Main {
    public static void main ( String[] args ) {
        Deque <Integer> stack = new LinkedList <> (  );

        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Enter the count of numbers to be generated" );
        Integer numbersCount = sc.nextInt ();
        sc.close ();

        System.out.print ( "Generated numbers are: " );
        for ( int i = 1 ; i <= numbersCount ; i++ ) {
            Integer item = new Random (  ).nextInt (100);
            stack.push ( item );

            System.out.print ( item);
            if (i == numbersCount) System.out.print ( "\n");
            else System.out.print (", " );
        }

        System.out.print ("The numbers in reverse order: " );
        for ( int i = 1 ; i <= numbersCount ; i++ ) {
            System.out.print ( stack.pop ( ));

            if ( i == numbersCount ) System.out.print ("\n" );
            else System.out.print ( ", " );
            }
        }
    }
