package Lesson3.Stack;

public class Expression {
    private String exp;

    public Expression(String exp) {
        this.exp = exp;
    }

    public boolean checkBracket() {
        MyStack<Character> stack = new MyStack<>(exp.length());
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    System.out.println("Error in " + i + " position");
                    return false;
                }
                char top = stack.pop();
                if (c == ')' && top != '(' || c == ']' && top != '[' || c == '}' && top != '{') {
                    System.out.println("Error in " + i + " position");
                    return false;
                }
            }
        }
        if (!stack.isEmpty()) {
            System.out.println("Error");
            return false;
        }
        return true;
    }
}
