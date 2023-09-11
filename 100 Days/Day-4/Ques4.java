import java.util.ArrayList;

public class Ques4 {
    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        //ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int row=1;row<=A;row++){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int col=1;col<=A;col++){
                if(col<=row){
                    temp.add(col);
                }
                else{
                    temp.add(0);
                }
            }
            ans.add(temp);
        }
        return ans;
    }
    public static void main(String[] args) {
        Ques4 instance=new Ques4();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        int A=4;
        ans = instance.solve(A);

        System.out.println("Ans for this question is : "+ans);

    }
}
