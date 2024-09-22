import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.math.*;

public class NumberOperations {
    public static void main(String[] args) {
        List<Object> numbers = new ArrayList<>();
        Collections.addAll(numbers, 10, 20.5, 30, 40.7, 50, 60.3, 70, 80.1, 90, 100.9);
        Collections.addAll(numbers, 2.5f, (byte) 127, (short) 32000, (long) 10000000, new BigDecimal("678.5"));

        System.out.print("List of numbers: ");
        for (Object number : numbers) {
            System.out.print(number + " ");
        }

        List<Double> numbers00 = new ArrayList<>();
        for (Object num : numbers) {
            Number number = (Number) num;
            numbers00.add(number.doubleValue());
        }

        System.out.print("\nList of fractional numbers: ");
        for (Double num : numbers00) {
            System.out.printf("%.2f ", num);
        }

        List<Integer> integers = new ArrayList<>();
        List<Double> doubles = new ArrayList<>();
        List<Float> floats = new ArrayList<>();
        List<Byte> bytes = new ArrayList<>();
        List<Short> shorts = new ArrayList<>();
        List<Long> longs = new ArrayList<>();
        List<BigDecimal> bigDecimals = new ArrayList<>();

        for (Object number : numbers) {
            if( number instanceof Integer ) {
                integers.add((Integer)number);
            }
            else if( number instanceof Double ) {
                doubles.add((Double)number);
            }
            else if ( number instanceof Float ) {
                floats.add((Float)number);
            }
            else if ( number instanceof Byte ) {
                bytes.add((Byte)number);
            }
            else if ( number instanceof Short ) {
                shorts.add((Short)number);
            }
            else if ( number instanceof Long ) {
                longs.add((Long)number);
            }
            else if ( number instanceof BigDecimal ) {
                bigDecimals.add((BigDecimal)number);
            }
        }

        System.out.print("\nList of integers: ");
        for (Integer i : integers) {
            System.out.printf("%d ", i);
        }

        System.out.print("\nList of doubles: ");
        for (Double d : doubles) {
            System.out.printf(d + " ");
        }

        System.out.print("\nList of floats: ");
        for (Float f : floats) {
            System.out.printf(f + " ");
        }

        System.out.print("\nList of bytes: ");
        for (Byte b : bytes) {
            System.out.printf(b + " ");
        }

        System.out.print("\nList of shorts: ");
        for (Short s : shorts) {
            System.out.printf(s + " ");
        }

        System.out.print("\nList of longs: ");
        for (Long i : longs) {
            System.out.printf(i + " ");
        }

        System.out.print("\nList of big decimals: ");
        for (BigDecimal b : bigDecimals) {
            System.out.printf(b + " ");
        }

        Double result = 1.0;
        for (int i = 0; i < 5; i++) {
            result *= numbers00.get(i);
        }
        System.out.printf("\nThe result of multiplication of the first five numbers in the list is: %.0f ", result);
    }
}

