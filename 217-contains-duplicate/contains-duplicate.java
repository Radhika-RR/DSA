class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> arraySet = new HashSet<>();
        for(int num : nums){
            if(arraySet.contains(num)){
                return true;
            }else{
                arraySet.add(num);
            }
        }
        return false;
    } 

}