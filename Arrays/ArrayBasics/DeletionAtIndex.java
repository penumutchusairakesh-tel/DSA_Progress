public class DeletionAtIndex {
    public static void main(String[] args) {
        int [] ar = new int[5];
        int x=10;
        for(int i=0;i<5;i++){
            ar[i] =x;
            x+=10;
        }
        System.out.println("INITIAL ARRAY");
        for(int i=0;i<ar.length;i++){
            System.out.println(i+" "+ar[i]);
        }
        int index = 4;
        for(int i=0;i<ar.length-1;i++){
            System.out.println("i = "+i);
            if(i>=index){
                ar[i] = ar[i+1];
            }

        }
        ar[ar.length-1] = -1;
        System.out.println("SHIFTED ARRAY");
        for(int i=0;i<ar.length;i++){
            System.out.println(i+" "+ar[i]);
        }
}
}
