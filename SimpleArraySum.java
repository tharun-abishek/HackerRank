public class SimpleArraySum {

      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int sum = 0;
        
        for(int i = 0; i < length; i++) {
            sum += input.nextInt();
        }
        
        System.out.println(sum);
    }
}