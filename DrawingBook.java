class DrawingBook {

    /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    public static int pageCount(int n, int p) {
    // Write your code here
    int front = p/2;
    int back=n/2-p/2;
    if(front<=back)
    return front;
    else
    return back;
    }

}
