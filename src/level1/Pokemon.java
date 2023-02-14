package level1;

import java.util.HashSet;
import java.util.Set;

public class Pokemon {

    public int solution(int[] nums) {
        int choice = nums.length / 2;
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i<nums.length; i++) {
            if(!set.contains(nums[i])) {
                set.add(nums[i]);
            }
        }
        if(set.size() < choice) {
            return set.size();
        } else {
            return choice;
        }
    }
}
