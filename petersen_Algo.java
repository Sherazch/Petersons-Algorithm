package lab8;
import java.util.Scanner;
public class petersen_Algo {
      public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the no. of blocks and process you want:");
            int n = s.nextInt();
            int[] blocks = new int[n];
            System.out.println("Enter the sizes of blocks you have:");
            for (int k = 0; k < n; k++) {
                  int m = s.nextInt();
                  blocks[k] = m;
            }
 
            int[] jobs = new int[n];
            System.out.println("Enter the size of incoming processes:");
            for (int i = 0; i < n; i++) {
                  int m = s.nextInt();
                  jobs[i] = m;
            }
            boolean booked[] = new boolean[n];
            for (int i = 0; i < n; i++) {// jobsize
                  int sub[] = new int[n];
                  for (int k = 0; k < n; k++) {// blocksize
                        if (blocks[k] >= jobs[i]) {
                              sub[k] = blocks[k] - jobs[i];
                        } else {
                              sub[k] = blocks[k];
                        }
                  }
 
                  int ok = FindSmallest(sub);
                  
                  if (!booked[ok]) {
                        System.out.println(" Process " + jobs[i] + " in block of size " + blocks[ok]);
                        booked[ok]=true;
                  } else {
                        System.out.println(" Process " + jobs[i] + " cannot be placed in any Block");
                  }
 
            }
 
      }
 
      public static int FindSmallest(int[] arr1) {// start method
 
            int index = 0;
            int min = arr1[index];
            for (int i = 1; i < arr1.length; i++) {
 
                  if (arr1[i] < min) {
                        min = arr1[i];
                        index = i;
                  }
            }
            return index;
      }
}
