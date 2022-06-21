class Result {

    /*
     * Complete the 'serviceLane' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY cases
     */

    public static List<Integer> serviceLane(int n, List<List<Integer>> cases,List<Integer> width ) {
    // Write your code here
    List<Integer> result=new ArrayList<>();
    for(int i =0;i<cases.size();i++){
          int minimum=3;
      for(int j= cases.get(i).get(0);j<=cases.get(i).get(1);j++){
          if(width.get(j)<minimum){
              minimum=width.get(j);   
          }
      }
          result.add(i,minimum);
    }
    
  return result;  

    }

}