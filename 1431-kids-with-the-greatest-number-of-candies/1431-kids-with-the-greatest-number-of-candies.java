class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxcandies=0;
        for(int i=0;i<candies.length;i++){
            maxcandies=Math.max(maxcandies,candies[i]);
        }
        List<Boolean> result=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=maxcandies){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}

    
