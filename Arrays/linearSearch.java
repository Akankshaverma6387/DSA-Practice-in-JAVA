
public class linearSearch{
    public static void main(String args[]){
        int key=30;
        int arr[]={10,20,30,40,50,60};
        for(int i=0;i<arr.length;i++){
           if(arr[i]==key){
            System.out.println("key found at index:"+ i);
            return;
           }
        }
        System.out.println("key does not exist");
    }
}