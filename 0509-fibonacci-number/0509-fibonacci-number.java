class Solution {
    int curr=0;
    int next=1;
    int temp=0;
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        return series(n);



    }
    int series(int a){
        
        if(a>1){
            temp=curr;
            curr=next;
            next+=temp;
            series(a-1);
        }
        return next;
    }
}