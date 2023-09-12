public class Ques2 {
    public String addBinary(String A, String B) {
	    int nA, nB;
	    char res[];
	    int i, j, k;
	    nA = A.length();
	    nB = B.length();
	    res = new char[Math.max(nA, nB) + 1];
	    k = Math.max(nA, nB);
	    i = nA - 1;
	    j = nB - 1;
	    int sum = 0, carry = 0;
	    // we add bits from the rightmost bit to the leftmost bit
	    while (i >= 0 || j >= 0 || carry != 0) {
	        sum = carry;
	        if (i >= 0)
	            sum += (A.charAt(i) - '0');
	        if (j >= 0)
	            sum += (B.charAt(j) - '0');
	        res[k] = (char) ((sum % 2) + '0');
	        carry = sum / 2;
	        i--;
	        j--;
	        k--;
	    }
	    if (res[0] == '1')
	        return new String(res);
	    int len = Math.max(nA, nB);
	    return new String(res, 1, len);
	}
    public static void main(String[] args){
        String A="1000";
        String B="100";
        Ques2 Instance=new Ques2();
    	String ans = Instance.addBinary(A, B);
    	
    	System.out.println("The Required and: "+ans);
    }
}
