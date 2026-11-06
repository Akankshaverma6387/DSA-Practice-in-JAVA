import java.util.*;
public class ArrayBasics{
    public static void main(String args[]){
       int marks[]=new int[3];
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter marks of physics:");
       marks[0]=sc.nextInt();
       System.out.println("Enter marks of maths:");
       marks[1]=sc.nextInt();
       System.out.println("Enter marks of chemistry:");
       marks[2]=sc.nextInt();
       System.out.println("Phy:" + marks[0]);
       System.out.println("Maths:" + marks[1]);
       System.out.println("Chem:" + marks[2]);
    }
}