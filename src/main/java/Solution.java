public class Solution {
    public int numberOfMatches(int n) {
        int count = 0;
        boolean carry = false;
        while(n > 0){
            if(carry){
                n++;
                carry = false;
            }
            count += n / 2;
            if(n % 2 == 1){
                carry = true;
            }
            n = n / 2;
        }
        return count;
    }

}
