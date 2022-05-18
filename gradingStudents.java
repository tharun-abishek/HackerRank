class gradingStudents {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
        List<Integer> result=new ArrayList<Integer>();
        int roundOf=0;
        for (Integer integer : grades) {
            if(integer>=38){
                roundOf=integer/5;
                if((roundOf+1)*5-integer<=2){
                    result.add((roundOf+1)*5);
                }
                else{
                    result.add(integer);
                }
            }
            else{
                result.add(integer);
            }
            
            
        }
return result;
    }

}