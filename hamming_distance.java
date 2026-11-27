class hamming_distance {
    public int hammingDistance(int x, int y) {
        int a = x^y;
        int b = 0;
        while(a >0){
            if(a%2 == 1){
                b +=1;
            }
            a = a/2;
        }
        return b;  
    }
} 
    

