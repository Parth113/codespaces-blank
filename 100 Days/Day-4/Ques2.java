import java.util.ArrayList;

public class Ques2 {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;

        for(Integer X:A){
            if(X>max1){
                max2= max1;
                max1=X;
            }
            else if(max2<X){
                max2=X;
            }
        }

        for(Integer X:A){
            if(X!=max2 && X!=max1){
                temp.add(X);
            }
        }

        return temp;
    }
    public static void main(String[] args) {
		Ques2 instance=new Ques2();
		ArrayList<Integer> A = new ArrayList<>();
        A.add(11);
        A.add(17);
        A.add(100);
        A.add(5);

        ArrayList<Integer> ans = new ArrayList<Integer>();
		ans = instance.solve(A);

		System.out.println("Ans for this question is : "+ans);

    }
}
