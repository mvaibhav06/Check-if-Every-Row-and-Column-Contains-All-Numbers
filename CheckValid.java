class CheckValid {
    public boolean checkValid(int[][] matrix) {
        int len = matrix.length;
        Set<Integer> temp = new HashSet<>();
        int sum = 0;
        long pro = 1;
        for(int i=1; i<=len; i++){
            temp.add(i);
            sum += i;
            pro *= i;
        }

        for(int i=0; i<matrix.length; i++){
            int sum1 = 0;
            int sum2 = 0;
            long pro1 = 1;
            long pro2 = 1;

            for(int j=0; j<matrix[i].length; j++){
                if(!temp.contains(matrix[i][j])){
                    return false;
                }
                if(!temp.contains(matrix[j][i])){
                    return false;
                }
                sum1 += matrix[i][j];
                sum2 += matrix[j][i];

                pro1 *= matrix[i][j];
                pro2 *= matrix[j][i];
            }
            if(sum != sum1 || sum!=sum2 || pro!=pro1 || pro!=pro2){
                return false;
            }
        }
        
        return true;
    }
}
