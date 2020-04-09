package Lesson3.Stack;

public class StringInversion {

    private String str;

    public StringInversion(String str) {
        this.str = str;
    }

    public String inversion() {
        MyStack<Character> stack = new MyStack<>(str.length());
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(stack.pop());
        }
        String strInv = sb.toString();
        return strInv;
    }
}
