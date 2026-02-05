package org.APCSLowell;

public class Palindrome {
    public boolean palindrome(String s) {
        String cleaned = clean(s);
        return cleaned.equals(reverse(cleaned));
    }
    
    public String clean(String s) {
        String result = "";
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result += c;
            }
        }
        return result;
    }
    
    public String reverse(String s) {
        String n = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            n += s.charAt(i);
        }
        return n;
    }
}
