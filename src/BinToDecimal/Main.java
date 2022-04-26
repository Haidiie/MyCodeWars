package BinToDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println(Converter.binToDecimal("1")); //expects 1
        System.out.println(Converter.binToDecimal("0")); //expects 0
        System.out.println(Converter.binToDecimal("1001001")); //expects 73
    }
}
