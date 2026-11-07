public class palindromeString{
    public static void main(String args[]){
        String str="madam";
        for(int i=0;i<str.length()/2;i++){
           if(str.charAt(i)==str.charAt(str.length()-1-i)){
            System.out.println("String is palindrome.");
            return;
           }else{
            System.out.println("string is not palindrome");
           }
        }
    }
}