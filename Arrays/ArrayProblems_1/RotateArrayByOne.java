public class RotateArrayByOne {
    public static void main(String[] args){
        int [] ar = {-1, 0, 3, 6};
        for(int x : ar){
            System.out.print(x+" ");
        }

        int temp = ar[0];
        for(int i=1;i< ar.length;i++){
            ar[i-1] = ar[i];
        }
        ar[ar.length-1] = temp;

        System.out.println("Rotated by 1 place");
        for(int x : ar){
            System.out.print(x+" ");
        }
    }

}
