package level1;

import java.util.Arrays;

public class MakeDecimal {

    public int solution(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3];

        boolean[] arr = new boolean[max + 1];
        arr[0] = arr[1] = true;

        for(int i=2; i<arr.length; i++) {
            if(arr[i]) continue;
            for(int j=i*2; j<arr.length; j += i) {
                if(arr[i]) continue;
                arr[j] = true;
            }
        }

        int answer = 0;
        int index = 0;
        for(int i=0; i<nums.length - 2; i++) {
            for(int j=i+1; j<nums.length - 1; j++) {
                for(int z=j+1; z<nums.length; z++) {
                    index = nums[i] + nums[j] + nums[z];
                    if(!arr[index]) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
