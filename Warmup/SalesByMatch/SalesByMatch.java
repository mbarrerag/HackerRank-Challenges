class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        int socks = 0;
        int length = n-1;

        List<Integer> array = ar;

        for(int i= 0; i<=length; i++){

            int value = array.get(i);

            for(int j=i+1; j<=length; j++){
                if(value == array.get(j)){
                    array.remove(j);
                    socks++;
                    length--;
                    break;
                }

            }

        }
        return socks;
    }

}