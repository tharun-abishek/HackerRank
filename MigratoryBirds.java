class MigratoryBirds {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
    int max=0,typeId=1;
      for(int type=1;type<=5;type++){
            int count=0;
          for(int j=0;j<arr.size();j++){
              if(arr.get(j)==type){
                  count++;
              }
          
          if(count>max){
              max=count;
              typeId=type;
          }
          } 
      }
    return typeId;
    }

}
