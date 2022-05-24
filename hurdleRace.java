class hurdleRace {

    /*
     * Complete the 'hurdleRace' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY height
     */

    public static int hurdleRace(int k, List<Integer> height) {
    // Write your code here
    int max=-1,num=0;
    for(int i=0;i<height.size();i++){
        if(height.get(i)>max){
            max=height.get(i);
        }
        
    }
     num=max-k;
     if(num<0){
         return 0;
     }
     else
     return num;
    }

}