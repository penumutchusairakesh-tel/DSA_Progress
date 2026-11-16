public class InsertAtIndex {
     public static void main(String[] args){
         int ele = 35;
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
         int index = 5;

         int [] ar2 = new int[ar.length+1];
//         for(int i=0;i<index;i++) {
//             ar2[i] = ar[i];
//         }
//          ar2[index] = ele;
//         for(int i=index;i<ar.length;i++){
//             ar2[i + 1] = ar[i];
//         }

         for(int i=0;i<ar2.length;i++){
             if(i == index){
                 ar2[index] = ele;
             }
             else if(i>index){
                 ar2[i] = ar[i-1];
             }
             else{
                 ar2[i]=ar[i];
             }

         }
         System.out.println("SHIFTED ARRAY");
         for(int i=0;i<ar2.length;i++){
             System.out.println(i+" "+ar2[i]);
         }
     }
}
