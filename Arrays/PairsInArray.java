public class PairsInArray{
    public static void main(String args[]){
        int arr[]={12,45,98,73,39};
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+ curr + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }
}