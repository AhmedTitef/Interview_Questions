package fasttrackd.trailingzeros;

import java.math.BigInteger;

public class Result {

    public static void main(String[] args) {

        System.out.println(zeros( 23 ));
    }


    public static int zeros(int n) {

        // Write your code here

        BigInteger result  = factorial( n );
        System.out.println(result);

        char [] resultsInChars = String.valueOf( result ).toCharArray();



        int count = 0;
        for (int i = resultsInChars.length -1; i >= 0; i--){

            if (resultsInChars[i]  == '0'){

                count ++ ;
            }else{
               break;
            }
        }


        return count;





    }


//    static long factorial(int  number){
//        if (number == 0){
//            return 1;
//        }else{
//
//            return (number * factorial( number-1 ));
//
//        }
//    }

    static BigInteger factorial(int  number){
        BigInteger factorial = BigInteger.valueOf( number );
        BigInteger one = BigInteger.ONE;
        if (number == 0){
            return one;
        }else{

            return (factorial.multiply(  factorial( number-1 )) );

        }
    }



}


