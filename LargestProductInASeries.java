public class LargestProductInASeries
{
    public static long getLargestProductInASeries()
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("73167176531330624919225119674426574742355349194934");
        stringBuilder.append("96983520312774506326239578318016984801869478851843");
        stringBuilder.append("85861560789112949495459501737958331952853208805511");
        stringBuilder.append("12540698747158523863050715693290963295227443043557");
        stringBuilder.append("66896648950445244523161731856403098711121722383113");
        stringBuilder.append("62229893423380308135336276614282806444486645238749");
        stringBuilder.append("30358907296290491560440772390713810515859307960866");
        stringBuilder.append("70172427121883998797908792274921901699720888093776");
        stringBuilder.append("65727333001053367881220235421809751254540594752243");
        stringBuilder.append("52584907711670556013604839586446706324415722155397");
        stringBuilder.append("53697817977846174064955149290862569321978468622482");
        stringBuilder.append("83972241375657056057490261407972968652414535100474");
        stringBuilder.append("82166370484403199890008895243450658541227588666881");
        stringBuilder.append("16427171479924442928230863465674813919123162824586");
        stringBuilder.append("17866458359124566529476545682848912883142607690042");
        stringBuilder.append("24219022671055626321111109370544217506941658960408");
        stringBuilder.append("07198403850962455444362981230987879927244284909188");
        stringBuilder.append("84580156166097919133875499200524063689912560717606");
        stringBuilder.append("05886116467109405077541002256983155200055935729725");
        stringBuilder.append("71636269561882670428252483600823257530420752963450");
        String series = stringBuilder.toString();

        long largestProduct = 0;
        long currentProduct;

        for(int i = 0; i < series.length() - 12; i++)
        {
            currentProduct = 1;
            for(int j = 0; j < 13; j++) currentProduct *= Character.getNumericValue(series.charAt(i + j));
            largestProduct = Math.max(largestProduct, currentProduct);
        }

        return largestProduct;
    }

    public static void main(String[] args)
    {
        System.out.println(getLargestProductInASeries());
    }
}
