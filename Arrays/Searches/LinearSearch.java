public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {10,20,34,57,38,93,64};
        int key = 38;
        int result = LS(arr,key);
        if(result==-1){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("FOUND AT "+result);
        }
    }
    public static int LS(int [] ar,int key){
        for(int i=0;i<ar.length;i++){
           if(ar[i]==key){
               return i;
           }
        }
        return -1;
    }
}
