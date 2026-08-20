class Solution {
    public int trailingZeroes(int n) {
        Scanner sc=new Scanner(System.in);
       
        int count = 0;

        while (n > 0) {
            n = n / 5;
            count += n;
        }

        return count;
    }
}