public class DeletionAllOcurance {
    public static void main(String[]args){
        int [] ar = {10,20,30,20,20,40};
        System.out.println("INITIAL ARRAY");
        for(int i=0;i<ar.length;i++){
            System.out.println(i+" "+ar[i]);
        }
        int ele = 20;
        int j=0,i=0;
        while (i != ar.length) {
            if(ar[i]==ele){
                i++;
            }
            else{
                ar[j] = ar[i];
                i++;
                j++;
                //System.out.println(i+" "+j);
            }

        }

        System.out.println("Deleted ARRAY");
        for(int a=0;a<j;a++){
            System.out.println(a+" "+ar[a]);
        }
    }
}
