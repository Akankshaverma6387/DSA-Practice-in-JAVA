public class binarySearch{
    public static int binarysearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
        if(arr[mid]==key){
            return mid;
        }
        if(arr[mid]<key){
            start=mid+1;
        }else{
            end=mid-1;
        }
        }
      return -1;
    }
    public static void main(String args[]){
        int key=50;
        int arr[]={10,20,30,40,50,60,70};
        int res=binarysearch(arr,key);
        if(res==-1){
          System.out.println("Key not found");
        }else{
            System.out.println("key found at index:" + res);
        }
        
    }
}