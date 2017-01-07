import java.util.Arrays;

class movingShift{
    public static void main(String[] args){
        String u =  "I should have known that you would have a perfect answer for me!!!";
        String[] results = movingShift("I should have known that you would have a perfect answer for me!!!", 1);
        System.out.printf("total length = %d \nlengths = %d %d %d %d %d \n", u.length(), results[0].length(), results[1].length(),results[2].length(),results[3].length(),results[4].length());
        System.out.println(Arrays.deepToString(results));
        System.out.printf("The unencrypted string is %s\n", decrypt(results, 1));
    }

    public static String[] movingShift(String unencrypted, int n){ //Where n is the starting shift value
        String encrypted = "";
        int shift = n;
        //Loop through each character and shift by 'shift' values down the alphabet
        for(int i = 0 ; i < unencrypted.length() ; i++){
            int ascii = unencrypted.charAt(i);
            ascii += shift;
            shift = shift % 26;
            //Ensure ascii values are within range
            if(ascii > 122 || (ascii > 90 && ascii < 97)){
                ascii -= 26;
            }
            //Convert ascii value back to char
            String newChar = Character.toString((char) ascii);
            if(((97 <= ascii) && (ascii <= 122)) || ((65 <= ascii) && (ascii <= 90))){
                encrypted += newChar;
            }else{
                encrypted += unencrypted.charAt(i);
            }
            shift++;
        }
        String[] returnVal = splitFiveWays(encrypted);
        return returnVal;

    }

    //This function splits a string five ways as evenly as possible
    //With the 5th element being the shortest if required
    public static String[] splitFiveWays(String to_split){
        String[] string_portions = new String[5];
        int string_len = to_split.length();
        if(string_len % 5 == 0){
            int pos = 0;
            for(int i = 0; i < string_len ; i += string_len/5){
                string_portions[pos] = to_split.substring(i, i + string_len/5);
                pos++;
            }
        }else{
            int lastRunner = string_len % 4;
            int otherRunners = (string_len - lastRunner) / 4;
            int pos = 0;
            for(int i = 0 ; i < otherRunners*4 ; i += otherRunners){
                string_portions[pos] = to_split.substring(i, i + otherRunners);
                pos++;
            }
            string_portions[pos] = to_split.substring(string_len - lastRunner, string_len);

        }
        return string_portions;

    }

    public static String decrypt(String[] encrypted_array, int n){
        String encrypted_line = String.join("", encrypted_array );
        int shift = n;
        String new_line = "";
        //Loop through each character and shift by 'shift' values down the alphabet
        for(int i = 0 ; i < encrypted_line.length() ; i++){
            int ascii = encrypted_line.charAt(i);
            ascii -= shift;
            shift = shift % 26;
            //Ensure ascii values are within range
            if((ascii < 97 && ascii > 90) || ascii < 65 ){
                ascii += 26;
            }
            //Convert ascii value back to char
            String newChar = Character.toString((char) ascii);
            if(((97 <= ascii) && (ascii <= 122)) || ((65 <= ascii) && (ascii <= 90))){
                new_line += newChar;
            }else{
                new_line += encrypted_line.charAt(i);
            }
            shift++;
        }
        return new_line;
    }

    public static char shiftChar(char input_char, int shift_val){
        int ascii = input_char;
    }
}
