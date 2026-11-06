public class smallestNum{
    public static void main(String args[]){
        int arr[]={23,90,45,29,48,12};
        int smallest=arr[0];
        for(int i=1; i<arr.length; i++){
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        }
        System.out.println("smallest number is:"+ smallest);
    }
}