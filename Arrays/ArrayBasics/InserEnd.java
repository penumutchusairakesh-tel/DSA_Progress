public class InserEnd {
    public static void main(String[] args) {
        int [] ar = new int[5];
        int x=10;
        for(int i=1;i<5;i++){
            ar[i] =x;
            x+=10;
        }
        System.out.println("INITIAL ARRAY");
        for(int i=0;i<ar.length;i++){
            System.out.println(i+" "+ar[i]);
        }
        //METHOD TO INSERT AT ENDING
        InsertEnd(ar,50);

        System.out.println("Shifted ARRAY");
        for(int i=0;i<ar.length;i++){
            System.out.println(i+" "+ar[i]);
        }
}

    public static void InsertEnd(int[]ar,int ele){
        for(int i =0;i<ar.length-1;i++){
            ar[i] = ar[i+1];
        }
        ar[ar.length-1] = ele;

    }
}



