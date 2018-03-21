import java.util.HashSet;
import java.util.Set;


class Solution3 {
    public int lengthOfLongestSubstring(String s) {
    	int subStringNum =0;
    	for(int i=0;i<s.length();i++){//将他想做对一个数组的中间切片必须有两个指针来推动切片
    		for(int j =i+1;j <= s.length();j++){
    			if(allqualified(i,j,s)){//验证是否是未有重复字符的切片
    				subStringNum =Math.max(subStringNum,j-i);//捕捉最大的切块
    			}
    			
    		}
    		
    	}
    	
		return subStringNum;
        
    }

	private boolean allqualified(int start, int end, String s) {
		// TODO Auto-generated method stub
		Set<Character> set = new HashSet<>();
		for(int i=start;i<end;i++){
			Character ch =s.charAt(i);
			if(set.contains(ch)) return false;
			set.add(ch);
		}		
		return true;
	}
}