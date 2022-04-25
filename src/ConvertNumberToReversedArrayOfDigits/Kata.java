package ConvertNumberToReversedArrayOfDigits;

public class Kata {
    public static int[] digitize (Long n){
        String nToString = Long.toString(n);
        int [] nToArrayInt = new int[nToString.length()];
        int [] result = new int[nToString.length()];

        for (int i = 0; i < nToArrayInt.length; i++ ){
            nToArrayInt[i] = nToString.charAt(i) -'0';
        }

        for (int i = nToArrayInt.length-1,j = 0; i >= 0; i--,j++){
            result[j] = nToArrayInt[i];
        }

        return result;
    }
}
