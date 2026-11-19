public class SecondLargestElement  {
    public static void main(String[]args){
        int [] ar = {10, 10, 10, 10, 10};
        //int [] ar2 = {8, 8, 7, 6, 5};

        int largest = ar[0];
        int sl=Integer.MIN_VALUE;
        boolean found = false;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>largest){
                sl = largest;
                largest =  ar[i];
                found = true;
            }
            else if(ar[i]>sl && ar[i]<largest){
                sl = ar[i];
                found = true;
            }

        }
        if(!found){
            System.out.println("Not found");
        }
        System.out.println(largest);
        System.out.println(sl);


    }
}
