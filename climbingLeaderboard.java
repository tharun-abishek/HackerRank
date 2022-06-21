class Result {

    /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
    // Write your code here
    List<Integer> result = new ArrayList<>(player);
    TreeSet<Integer> treeSet = new TreeSet<>(ranked);
    ranked.clear();ranked.addAll(treeSet);
    Collections.reverse(ranked);int n = ranked.size();
    int i=0; int j=n-1;
        while(i<player.size())
        {
            if(player.get(i)>=ranked.get(j)){
            result.set(i,j+1);
            if(j==0){
                i++;
            }
            if(j>0){
            j--;
            }

            }
            else if(player.get(i)<ranked.get(j)){
                result.set(i,j+2);
                i++;
            }
            
                }
             
       System.out.println(result);
    return result;
   
    }

}