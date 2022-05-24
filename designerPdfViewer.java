class designerPdfViewer {

    /*
     * Complete the 'designerPdfViewer' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h
     *  2. STRING word
     */

    public static int designerPdfViewer(List<Integer> h, String word) {
    // Write your code here
    int max=-1;
    for(int i=0;i<word.length();i++){
        int index = word.charAt(i)-97;
        if(h.get(index)>max){
            max=h.get(index);
        }
    }
   max=max*word.length();
   return max;
    }

}
