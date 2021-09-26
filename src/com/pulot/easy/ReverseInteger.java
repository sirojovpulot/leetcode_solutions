package com.pulot.easy;

public class ReverseInteger {
    public int reverse(int x) {
        try {
            int i = x > 0 ? 1 : -1;
            StringBuilder s = new StringBuilder();
            do {
                int q = Math.abs(x % 10);
                x = x / 10;
                s.append(q);
            } while (Math.abs(x) >= 1);
            return i == -1 ? (s.length() > 1 ? Integer.parseInt(("-" + s.toString())) : i * Integer.parseInt(s.toString()))
                    : Integer.parseInt(s.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
