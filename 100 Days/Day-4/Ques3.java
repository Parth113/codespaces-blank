import java.util.ArrayList;

public class Ques3 {
    public int solve(ArrayList<Integer> A) {
        int maxEven=Integer.MIN_VALUE;
        int minOdd=Integer.MAX_VALUE;

        for(Integer X:A){
            if(X%2==0){
                maxEven=Math.max(X,maxEven);
            }
            else{
                minOdd=Math.min(X,minOdd);
            }
        }
        return (maxEven-minOdd);
    }
    public static void main(String[] args) {
        Ques3 instance=new Ques3();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(0);
		A.add(2);
		A.add(9);

        int ans = instance.solve(A);
        System.out.println("Ans for this question is : "+ans);

    }
}
