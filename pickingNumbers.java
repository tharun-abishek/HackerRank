class pickingNumbers {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
    // Write your code here
    int max=0;
    Collections.sort(a);
    for(int i=0;i<a.size();i++){
        int count=1;
        for(int j=i+1;j<a.size();j++){
            if(a.get(j)-a.get(i)<=1){
                count++;
            }
             if(count>max){
             max=count;
            
    }
        }
    }
   
return max;
    }

}
