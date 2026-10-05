class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(Integer num:nums){
            set.add(num);
        }
        if(set.size()==nums.length){
            return false;
        }
        return true;
        
    }
}