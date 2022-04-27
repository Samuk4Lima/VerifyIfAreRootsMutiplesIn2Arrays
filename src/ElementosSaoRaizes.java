public class ElementosSaoRaizes {
    /**
     * Escreva um programa que verifique se ha no vetor b
     * Numeros que sao raizes do vetor a, caso todos os elementos
     * de B sejam multiplos de todas as raizes do vetor A retorne true,
     * caso nao retorne false
     *
     * ex : a = [121, 144, 19, 161, 19, 144, 19, 11]
     * b = [121, 14641, 20736, 361, 25921, 361, 20736, 361]
     *
     * a = [121, 144, 19, 161, 19, 144, 19, 11]
     * b = [11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19]
     */

    public static boolean comp(int[] a, int[] b) {

        boolean flag = false;
        for( double current : b){
            for (int i = 0; i < a.length; i++){
                int val = a[i];
                if (Math.sqrt(current) == val){
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
            }

            if (!flag)
                break;
        }


        if(flag)
            return true;
        else
            return false;

    }


    public static void main(String[] args) {
        int [] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int [] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};

        System.out.println(comp(a,b));

    }
}
