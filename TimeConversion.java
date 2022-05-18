class TimeConversion {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
     int length=s.length();
     char[] time = new char [length];
     for(int i=0; i<length;i++){
         time[i]=s.charAt(i);
     }
     if(time[8]=='P'){
         if(time[1]=='8'){
             time[0]='2';
             time[1]='0';       
         }
         else if (time[1]=='9'){
             time[0]='2';
             time[1]='1';
         }
         else if (time[0]=='1'&& time[1]=='2'){
             time[0]='1';
             time[1]='2';
         }
         else if (time[0]!='1'||time[1]!='2'){
             time[0]+=1;
             time[1]+=2;
         } 
         
     }
     if(time[8]=='A'){
         if(time[0]=='1'&&time[1]=='2'){
             time[0]='0';
             time[1]='0';
         }
     }
    String result="";
    for(int i=0;i<length-2;i++){
        result+=time[i];
    }
    return result;
    }

}