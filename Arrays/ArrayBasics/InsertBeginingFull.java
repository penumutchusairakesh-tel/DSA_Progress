public class InsertBeginingFull {
    public static void main(String[] args){
        int [] ar = new int[5];
        int x =10;
        for(int i=0;i< ar.length;i++){
            ar[i] =x;
            x+=10;
        }
        System.out.println("INITIAL ARRAY");
        for(int i=0;i<ar.length;i++){
            System.out.println(i+" "+ar[i]);
        }
        InsertBeg(ar,50);


    }
    public static void InsertBeg(int [] ar, int ele){
        int [] ar2 = new int[ar.length+1];
        for(int i =ar.length-1;i>=0;i--){
            ar2[i+1]= ar[i];
        }
        ar2[0] = ele;
        System.out.println("SHIFTED ARRAY");
        for(int i=0;i<ar2.length;i++){
            System.out.println(i+" "+ar2[i]);
        }
    }
}
