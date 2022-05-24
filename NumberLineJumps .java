class NumberLineJumps {

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
    // Write your code here
    String one="YES";
    String two="NO";
      int kangarooOne=x1+v1,kangarooTwo=x2+v2,count=0;
      for(int i=1;i<(kangarooOne*kangarooTwo);i++){
           if(x1+(v1*i)==(x2+(v2*i))){
              count++;
              break; 
           }
    
        }
    
    if(count>0){
        return one;
    }
    else
     return two;

    }

}