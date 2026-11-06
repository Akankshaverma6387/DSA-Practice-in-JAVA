public class largestNum{
    public static void main(String args[]){
        int arr[]={23,90,45,29,48,12};
        int largest=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("largest number is:"+ largest);
    }
}