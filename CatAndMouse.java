public class CatAndMouse {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        for(int i = 0; i < n; i++){
        int x= sc.nextInt();
        int y= sc.nextInt();
        int z= sc.nextInt();
        
        int catA=x-z, catB=y-z;
        if(catA<0){
            catA*=-1;
        }
        if(catB<0){
            catB*=-1;
        }
        if(catA==catB){
            System.out.println("Mouse C");     
        }
        else if(catA>catB){
           System.out.println("Cat B");
    }
        else {
            System.out.println("Cat A");
            
    }
        }
}
}