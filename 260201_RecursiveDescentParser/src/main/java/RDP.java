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
            throw new RDPExeption("Empty String");
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

                    if (bracketCount < 0) {
                        throw new RDPExeption("Missing '('");
                    }

                    if (bracketCount == 0) {
                        if (i == openedBracket + 1) {
                            throw new RDPExeption("Empty brackets");
                        }

                        double inner = evaluateIntern(s.substring(openedBracket + 1, i));
                        s = s.substring(0, openedBracket) + inner + s.substring(i + 1);
                        i = openedBracket - 1;
                    }
                    break;

                case '+':
                case '-':
                case '*':
                case '/':
                    if (i == 0 || "+-*/^(".indexOf(s.charAt(i - 1)) >= 0) {
                        throw new RDPExeption("Empty operante");
                    }
                    if (bracketCount == 0) {
                        lastOperator = c;
                    }
                    break;

                case '^':
                    if (i == 0 || "+-*/^(".indexOf(s.charAt(i - 1)) >= 0) {
                        throw new RDPExeption("Empty operante");
                    }
                    break;

                default:
                    if (Character.isLetter(c)) {
                        throw new RDPExeption("Unknown variable '" + c + "'");
                    }

                    if (!Character.isDigit(c) && c != '.') {
                        throw new RDPExeption("Invalid character '" + c + "'");
                    }

                    if (bracketCount == 0) {

                        int start = i;
                        while (i < s.length() && (Character.isDigit(s.charAt(i)) || s.charAt(i) == '.')) {
                            i++;
                        }

                        double num = Double.parseDouble(s.substring(start, i));

                        if (i < s.length() && s.charAt(i) == '^') {
                            double power = evaluateIntern(s.substring(i + 1));
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

                        if (Double.isInfinite(result) || Double.isNaN(result)) {
                            throw new RDPExeption("Result is infinite");
                        }
                    }
            }
        }

        if (bracketCount != 0) {
            throw new RDPExeption("Missing ')'");
        }

        return result;
    }
}
