class Result {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
    // Write your code here
    
    String s1 = s.replace(" ", "");
    s1= s1.toLowerCase();
    
   
        for(char i='a';i<='z';i++){
            if(!s1.contains(String.valueOf(i))){
                 return "not pangram";
            }
                       }
             return "pangram";
        }
     
    }