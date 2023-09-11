import java.util.ArrayList;
public class Ques1 {
	public int solve(ArrayList<Integer> A) {
		int minn=Integer.MAX_VALUE;
		int maxx=Integer.MIN_VALUE;
		
		for(Integer x:A) {
			maxx=Math.max(x,maxx);
			minn=Math.min(x,minn);
		}
		int cnt=0;
		for(Integer x:A) {
			if(x<maxx && x>minn) {
				cnt++;
			}
		}
		return cnt;
	}
    public static void main(String[] args) {
		Ques1 instance=new Ques1();
		ArrayList<Integer> A = new ArrayList<>();
		A.add(10);
		A.add(30);
		A.add(20);
		A.add(30);
		A.add(70);
		A.add(50);

		int ans = instance.solve(A);

		System.out.println("Ans for this question is : "+ans);

    }
}