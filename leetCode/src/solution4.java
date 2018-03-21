
class Solution4 {
	class Solution {
	    public String longestPalindrome(String s) {
	        int start = 0,end =0;
	        for(int i=0;i<s.length();i++){
	            int length1 =expandLength(s,i,i);
	            int length2 =expandLength(s,i,i+1);
	            int length=Math.max(length1,length2);
	            if(length>end-start){
	                end= i+length/2;
	                start= i-(length-1)/2;                
	            }
	        }
	        return s.substring(start,end+1);
	        
	    }
	    private int expandLength(String s,int left,int right){
	        while (left>=0&&right<s.length()&&s.charAt(left) ==s.charAt(right)){
	            left--;
	            right++;
	            
	        }
	        return right-left-1;
	    } 
	}
}
