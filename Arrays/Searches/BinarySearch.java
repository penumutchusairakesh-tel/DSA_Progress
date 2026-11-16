public class BinarySearch {
    public static void main(String[] args){
        int [] ar = {10,20,25,30,37,40,57,89}; //sorted array
        int key = 40;
        int result = BS(ar,key);
        if(result==-1){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("FOUND AT "+result);
        }


    }
    public static int BS(int[]ar,int key){
        int low = 0 , high = ar.length-1;
        int mid;
        while(low<high){
            mid =(low+high)/2;
            if(ar[mid]==key){
                return mid;
            }
            else if(key<ar[mid]){
                high = mid-1;
            }
            else{
                //key > ar[mid]
                low = mid+1;
            }
        }
        return -1;
    }
}
