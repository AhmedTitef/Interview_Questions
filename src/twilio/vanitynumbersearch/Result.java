package twilio.vanitynumbersearch;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Result {


    public static void main(String[] args) {
        System.out.println(vanity( new ArrayList<>( Arrays.asList("TWLO" , "CODE")  ) , new ArrayList<>( Arrays.asList( "+14157088956"  , "+15108926333" ) )));
    }

    public static List<String> vanity(List<String> codes, List<String> numbers) {



        // convert to number format



        List<String> results = new ArrayList<>(  );

        for (String c : codes) { // for each one code
            String number = "";
            for (char i : c.toCharArray()) { // for each one letter


                if (i == 'A' || i == 'B'  || i == 'C' ) {

                    number = number.concat( "2" );

                } else if ((i == 'D')|| (i == 'E' )|| (i == 'F')) {

                    number = number.concat( "3" );
                } else if  ((i == 'G')|| (i == 'H' )|| (i == 'I')) {

                    number = number.concat( "4" );
                } else if  ((i == 'J')|| (i == 'K' )|| (i == 'L')) {

                    number = number.concat( "5" );
                } else if  ((i == 'M')|| (i == 'N' )|| (i == 'O')) {

                    number = number.concat( "6" );
                } else if  ((i == 'P')|| (i == 'Q' )|| (i == 'R') ||  (i == 'S')){

                    number = number.concat( "7" );
                } else if  ((i == 'T')|| (i == 'U' )|| (i == 'V')){

                    number = number.concat( "8" );
                } else if  ((i == 'W')|| (i == 'X' )|| (i == 'Y')|| (i == 'Z')){

                    number = number.concat( "9" );
                } else {

                }
            }




//            System.out.println(number);
            for (String oneNumber : numbers){//checking if that number we found matches one of the given numbers or no

                System.out.println(oneNumber);
//                System.out.println(oneNumber);
                if (oneNumber.contains( number )){
                    results.add( oneNumber );
                }
            }

        }


        Collections.sort(results);

        return results;
    }
}
