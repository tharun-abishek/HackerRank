class Result {

    /*
     * Complete the 'anagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int anagram(String s) {
    // Write your code here
    int count=0;
    if(s.length()%2!=0){
        return -1;
    }
    else{
       String sub = s.substring(s.length()/2, s.length());
       char[] arr = sub.toCharArray();
       for(int i=0;i<s.length()/2;i++){
           for(int j=0;j<s.length()/2;j++){
               if(s.charAt(i)==arr[j]){
                   count++;
                   arr[j]=0;
                   break;
               }
              
           }
           
       }
    }
    return (s.length()/2-count);
    }
}