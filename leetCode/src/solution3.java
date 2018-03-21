import java.util.HashSet;
import java.util.Set;


class Solution3 {
    public int lengthOfLongestSubstring(String s) {
    	int subStringNum =0;
    	for(int i=0;i<s.length();i++){//����������һ��������м���Ƭ����������ָ�����ƶ���Ƭ
    		for(int j =i+1;j <= s.length();j++){
    			if(allqualified(i,j,s)){//��֤�Ƿ���δ���ظ��ַ�����Ƭ
    				subStringNum =Math.max(subStringNum,j-i);//��׽�����п�
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