import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ques1 {
    public int singleNumber(final List<Integer> A) {
    	HashMap<Integer,Integer> Temp = new HashMap<Integer,Integer>();
    	int ans=0;
    	for(int i=1;i<A.size();i++) {
    		int value=A.get(i);
    		Temp.put(value,Temp.getOrDefault(value,0)+1);
    	}
    	for(Map.Entry<Integer, Integer> entry : Temp.entrySet()){
    		if(entry.getValue()==1) {
    			ans=entry.getKey();
    		}
    	}
    	return ans;
    }
    public static void main(String[] args) {
    	List<Integer> A=List.of(1, 2, 4, 3, 3, 2, 2, 3, 1, 1);
    	Ques1 Instance=new Ques1();
    	int ans = Instance.singleNumber(A);
    	
    	System.out.println("The Required and: "+ans);
    }
}
