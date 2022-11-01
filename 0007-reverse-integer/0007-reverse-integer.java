class Solution {
    public int reverse(int n) {
        long rev=0;
        while(n!=0){
            rev=rev*10 + n%10;
            n=n/10;
        }
        if(rev >= Integer.MIN_VALUE && rev <= Integer.MAX_VALUE)
			return (int)rev;
		else
			return 0;
    }
}