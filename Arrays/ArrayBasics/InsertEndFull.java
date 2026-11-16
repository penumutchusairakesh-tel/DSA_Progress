public class InsertEndFull {
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
        InsertEndd(ar,60);


    }
    public static void InsertEndd(int [] ar, int ele){
        int [] ar2 = new int[ar.length+1];
        int n = ar2.length;
        for(int i =0;i<ar.length;i++){
            ar2[i]= ar[i];
        }
        ar2[n-1] = ele;
        System.out.println("SHIFTED ARRAY");
        for(int i=0;i<ar2.length;i++){
            System.out.println(i+" "+ar2[i]);
        }
    }
}
