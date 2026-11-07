public class stringBasics{
    public static void main(String args[]){
        String firstName="Akanksha";
        String lastName="Verma";
        //concatination
        System.out.println(firstName+" " +lastName);
        //charAt method
        System.out.println(firstName.charAt(3));
        //length
        System.out.println(firstName.length());
        //print letters of string
        System.out.println("Letters of string");
        for(int i=0;i<firstName.length();i++){
            System.out.println(firstName.charAt(i));
        }

    }
}