package twilio.smssplitting;

import java.util.ArrayList;
import java.util.List;

public class Result {

    public static void main(String[] args) {
        System.out.println(segments( "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis partu sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore ver rup. Li Europan lingues es membres del sam familie. Lor separat existentie es un myth. Por scientie, musica, sport etc, litot Europa." ));
    }

    public static List<String> segments(String message) {


        int limitPerSegment = 155;
        int suffixLength = 5;
        List<String> result = new ArrayList<>(  );

        // if message is already under 160 chars, adding to list and returning

        // it without changing anything
        if (message.length() <= limitPerSegment + suffixLength){
            result.add( message );
            return result;
        }else {


            double charCount = message.length();

            double numberOFSegmentsUnrounded = charCount/limitPerSegment;
            double numberOFSegments = Math.rint(numberOFSegmentsUnrounded);

            int beginningIndex = 0;
            int endingIndex = 0;
            for (int i = 0 ; i < numberOFSegments ; i++){
                beginningIndex = limitPerSegment * i;
                endingIndex  = beginningIndex + limitPerSegment;

                if (endingIndex > charCount) {
                    endingIndex = (int) charCount;
                }


                    String substring = message.substring( beginningIndex, endingIndex ) + "(" + (i+1) + "/" + (int)numberOFSegments + ")";
                    result.add( substring );







            }





        }


        return result;
    }


}
