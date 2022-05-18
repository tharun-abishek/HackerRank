class salesByMatch {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
   int count=0;
   for(int i=0;i<n;i++){
       int temp=ar.get(i);
       for (int j=i+1;j<n;j++){
           int temp1=ar.get(j);
           if(temp!=0){
               if(temp==temp1){
                   count++;
                   ar.set(j,0);
                   break;
               }
           }
       }
   }
   return count;
    }

}