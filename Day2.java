
/*
Assignment:
 Write a Java program which would take two values through
 command line argument and print the sum of the two values.
*/


class Day2{
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum = a + b;
        System.out.println("Sum of args is : "+sum);
    }
}