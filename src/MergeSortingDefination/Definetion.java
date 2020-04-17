package MergeSortingDefination;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Definetion {


    public static <T extends Comparable<T> > void sort(T[] table)
    {
        if(table.length>1)
        {
            int halfSize=table.length/2;
            T[] leftTable=(E[])new Comparator() [halfSize];
            T[] rightTable=(E[])new Comparator()[table.length-halfSize];
             System.arraycopy(table,0,leftTable,0,halfSize);
             System.arraycopy(table,halfSize,rightTable,0,table.length-halfSize);
             sort(leftTable);
             sort(rightTable);
             merge(table,leftTable,rightTable);
        }
    }
    private static <T extends Comparable<T>> void merge(T[] outputSequence,
                                                        T[] leftSequence,
                                                        T[] rightSequence) {
        int i = 0;
// Index into the left input sequence.
        int j = 0;
// Index into the right input sequence.
        int k = 0;
// Index into the output sequence.
// While there is data in both input sequences
        while (i < leftSequence.length && j < rightSequence.length) {
// Find the smaller and
// insert it into the output sequence.
            if (leftSequence[i].compareTo(rightSequence[j]) < 0) {
                outputSequence[k++] = leftSequence[i++];
            } else {
                outputSequence[k++] = rightSequence[j++];
            }
        }
// assert: one of the sequences has more items to copy.
// Copy remaining input from left sequence into the output.
        while (i < leftSequence.length) {
            outputSequence[k++] = leftSequence[i++];
        }
// Copy remaining input from right sequence into output.
        while (j < rightSequence.length) {
            outputSequence[k++] = rightSequence[j++];
        }
    }
}
