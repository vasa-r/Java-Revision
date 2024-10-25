package Loops;

/**
 * Loops
 */
public class Loops {

    public static void main(String[] args) {

    // ----------------- while -----------------
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

    // ----------------- do while -----------------
        do{
            System.out.println(i);
        }while(i < 5);

    // ----------------- for -----------------
        for(int j = 0; j <=5; j++){
            System.out.println(j);
        }

    // ----------------- for each -----------------

        int arr[]={1,2,3,4,5};

        for (int num : arr){
            System.out.print(num + " ");
        }

    }
}