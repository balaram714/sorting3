package MergeSorting;
import MergeSortingDefination.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the array length");
	int n=obj.nextInt();
	try {
        Integer a[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(a));
        Definetion d = new Definetion();
        d.sort(a);
        System.out.println("sorted array");
        System.out.println(Arrays.toString(a));
    }catch (Exception e){
	    System.out.println(e);
    }
    }
}
