package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {
        
        if (Float.isNaN(a) && Float.isNaN(b)) return true;
        if (Float.isInfinite(a) && Float.isInfinite(b)) return a == b;
        
        double scale = Math.pow(10, precision);
        
        long scaledA = Math.round(a * scale);
        long scaledB = Math.round(b * scale);
        
        return scaledA == scaledB;
    }

    public static void main(String[] args) {
        float a = 0.3f;
        float b = 0.4f;
        float sum = a + b;
        float c = 0.7f;

        boolean result = compare(sum, c, 2);
        System.out.println(result);

    }

}
