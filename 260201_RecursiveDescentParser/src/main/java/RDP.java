public class RDP {

    private String string;

    public RDP(String s) {
        this.string = s.replaceAll(" ", "");
    }

    public double evaluate() throws RDPExeption {
        return evaluateIntern(string);
    }

    public double evaluateIntern(String s) throws RDPExeption {

        if (s.isEmpty()) {
            throw new RDPExeption("Empty string");
        }

        if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            s = "0" + s;
        }

        double result = 0;
        char lastOperator = '+';

        int bracketCount = 0;
        int openedBracket = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            switch (c) {
                case '(':
                    if (bracketCount == 0) {
                        openedBracket = i;
                    }
                    bracketCount++;
                    break;

                case ')':
                    bracketCount--;

                    if (bracketCount == 0) {

                        double inner = evaluateIntern(s.substring(openedBracket + 1, i));

                        s = s.substring(0, openedBracket) + inner + s.substring(i + 1);

                        i = -1;
                        lastOperator = '+';
                        result = 0;
                    }
                    break;

                case '+':
                case '-':
                case '*':
                case '/':
                    if (bracketCount == 0) {
                        lastOperator = c;
                    }
                    break;

                default:
                    if (bracketCount == 0 && (Character.isDigit(c))) {
                        int start = i;

                        while (i < s.length() && (Character.isDigit(s.charAt(i)) || s.charAt(i) == '.')) {
                            i++;
                        }

                        double num =
                                Double.parseDouble(s.substring(start, i));

// Handle exponent
                        if (i < s.length() && s.charAt(i) == '^') {
                            double power =
                                    evaluateIntern(s.substring(i + 1));
                            num = Math.pow(num, power);
                            i = s.length();
                        } else {
                            i--;
                        }

                        switch (lastOperator) {
                            case '+': result += num; break;
                            case '-': result -= num; break;
                            case '*': result *= num; break;
                            case '/': result /= num; break;
                        }

                    }
            }
        }

        return result;
    }
}