package Lec02_09Feb;

public class DataTypes {
    public static void main(String[] args) {
        // Integer types
        byte byteVar = 127;  // 8-bit, Range: -128 to 127
        short shortVar = 32767;  // 16-bit, Range: -32,768 to 32,767
        int intVar = 2147483647;  // 32-bit, Range: -2^31 to 2^31 - 1
        long longVar = 9223372036854775807L;  // 64-bit, Range: -2^63 to 2^63 - 1

        // Floating-point types
        float floatVar = 3.4028235e38f;  // 32-bit, Approximate range: ±1.4 × 10^−45 to ±3.4 × 10^38
        double doubleVar = 1.7976931348623157e308;  // 64-bit, Approximate range: ±4.9 × 10^−324 to ±1.8 × 10^308

        // Character type - single letter / keyboard-symbol
        char charVar = 'A';  // 16-bit Unicode character (0 to 65,535)

        // Boolean type
        boolean boolVar = true;  // 1-bit (values: true or false)

        System.out.println("Data type examples:");
        System.out.println("Byte: " + byteVar);
        System.out.println("Short: " + shortVar);
        System.out.println("Int: " + intVar);
        System.out.println("Long: " + longVar);
        System.out.println("Float: " + floatVar);
        System.out.println("Double: " + doubleVar);
        System.out.println("Char: " + charVar);
        System.out.println("Boolean: " + boolVar);
    }
}
