class Result {

    /*
     * Complete the 'organizingContainers' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts 2D_INTEGER_ARRAY container as parameter.
     */

    public static String organizingContainers(List<List<Integer>> container) {
    // Write your code here
String one ="Possible";
String two ="Impossible";
int n = container.size();
List<Integer> row = new ArrayList<>();
List<Integer> column = new ArrayList<>();
    for(int i = 0;i<n;i++){
        int rowSum=0,columnSum=0;
    for(int j = 0;j<n;j++){
        rowSum+=container.get(i).get(j);
        columnSum+=container.get(j).get(i);    
    }
    row.add(i,rowSum);
    column.add(i,columnSum);
}
Collections.sort(row);Collections.sort(column);
if(row.equals(column))
 return one;
else
 return two;
    }

}
