package arrays;
import java.util.HashSet;

public class ContainDuplicates {
    public boolean containsDuplicates(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)) return true;

            set.add(num);
        }

        return false;
    }

    public static void main(String[] args){
        ContainDuplicates cd = new ContainDuplicates();

        int[] arr1 = {1, 2, 1, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println(cd.containsDuplicates(arr1));
        System.out.println(cd.containsDuplicates(arr2));
    }
}
