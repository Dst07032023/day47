package codingBat2.Warmup_2;

/**
 *
 Given a string, return a string made of the chars
 at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".


 altPairs("kitten") → "kien"
 altPairs("Chocolate") → "Chole"
 altPairs("CodingHorror") → "Congrr"
 */

public class altPairs {
    public static void main(String[] args) {
        String str = "kitten";


    }

    public String altPairs(String str) {

        String result = "";
        for(int i = 0; i < str.length(); i+=4){
            int end = i+2;
            if(end > str.length()){
                end = str.length();
            }
            result = result + str.substring(i, end);
        }
        return result;
    }
}
