public class InsertionAtBegining {
    public static void main(String[] args) {
        int [] ar = new int[5];
        int x=10;
        for(int i=0;i<4;i++){
            ar[i] =x;
            x+=10;
        }
        System.out.println("INITIAL ARRAY");
        for(int i=0;i<ar.length;i++){
            System.out.println(i+" "+ar[i]);
        }
        InsertBegin(ar,50);
        System.out.println("Shifted ARRAY");
        for(int i=0;i<ar.length;i++){
            System.out.println(i+" "+ar[i]);
        }
    }

    public static void InsertBegin(int[]ar,int ele){
        for (int i=ar.length-1;i>0;i--){
            //System.out.println(i);
            ar[i] = ar[i-1];
        }
        ar[0]= ele;
    }
}
