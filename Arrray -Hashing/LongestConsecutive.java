/*brute force time complexity=>O(n^2) space complexity => O(1) */
 /*class LongestConsecutive {
   public static int longestConsecutive(int[] nums){
    int longest =0;
    for(int i=0;i<nums.length;i++){
        int current = nums[i];
        int count =1;
        while(contains(nums,current+1)){
            current++;
            count++;
        }
        longest=Math.max(longest, count);

    }
    return longest;
   } 
   public static boolean contains(int[] nums,int target){
     for(int num:nums){
        if(num==target){
            return true;
        }
     }
     return false;
   }
   public static void main(String[] args) {

        int[] nums = {100, 4, 200, 1, 3, 2};

        System.out.println(longestConsecutive(nums));
    }
}*/
//OPTIMAL SOLUTION USES HASHSET
import java.util.HashSet;
class LongestConsecutive{
    public static int longestConsecutive(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num :nums){
            set.add(num);
        }
        int longest =0;
        for (int num:set){
            if(!set.contains(num-1)){
                int current = num;
                int count =1;
            
                while(set.contains(current+1)){
                    current++;
                    count++;
                }
longest=Math.max(count,longest);
            
        }
    }
    return longest;

}
public static void main(String[] args) {

        int[] nums = {100, 4, 200, 1, 3, 2};

        System.out.println(longestConsecutive(nums));
}
}
//time complexity => O(n) space =>O(n)