public class DeleteFirstOcur {
    public static void main(String[] args) {

        int[] ar = {10, 20, 30, 20, 20, 40};

        int ele = 20;
        boolean found = false;
        int size = ar.length;

        for (int i = 0; i < size; i++) {

            if (!found && ar[i] == ele) {
                found = true;
                size--;
            }
            else if (found) {
                ar[i - 1] = ar[i];
            }
        }

        System.out.println("Deleted ARRAY");

        for (int i = 0; i < size; i++) {
            System.out.println(i + " " + ar[i]);
        }
    }
}