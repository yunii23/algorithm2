package algorithm2.Programmers.Level1;

import java.util.HashMap;

public class java_1845 {
    // 프로그래머스 레벨1 폰켓몬

    public static void main(String[] args) {
        //int[] nums = {3,1,2,3};
        //int[] nums = {3,3,3,2,2,4};
        int[] nums = {3,3,3,2,2,2};

        int size = nums.length/2;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {

            if(map.containsKey(nums[i])) map.replace(nums[i], map.get(nums[i]) + 1);
            else map.put(nums[i], 0);
        }

        if(map.size() > size) System.out.println(size);
        else if(map.size() < size) System.out.println(map.size());
        else System.out.println(map.size());
    }
}
