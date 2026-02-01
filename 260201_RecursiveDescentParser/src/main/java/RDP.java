public class RDP {
    private String string;

    public RDP(String s) {
        this.string = s.replaceAll(" ", "");
    }

    public double evaluate() throws RDPExeption{
        return evaluateIntern(string);
    }

    public int find(String s, char c){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                return i;
            }
        }
        return -1;
    }

    public double evaluateIntern(String s) throws RDPExeption{
        System.out.println(s);

        double result = 0;

        if(s.isEmpty()){
            throw new RDPExeption("Empty string");
        }
        if(s.charAt(0) == '+' || s.charAt(0) == '-'){
            s = "0" + s;
        }

        int openedBracket = -1;
        int closedBracket = -1;
        char lastOperator = '+';
        for(int i = 0; i < s.length(); i++){
            System.out.println("Result: " + result);
            System.out.println("String: " + s);
            System.out.println("Char at: " + s.charAt(i));
            switch(s.charAt(i)){
                case '(':
                    openedBracket = i;
                    break;
                case ')':
                    closedBracket = i;
                    result += evaluateIntern(s.substring(openedBracket + 1, closedBracket));
                    String temp = s.substring(0, openedBracket) + s.substring(closedBracket, s.length() - closedBracket + 2);
                    s = temp;
                    break;
                case '1', '2', '3', '4', '5', '6', '7', '8', '9':
                    switch(lastOperator){
                        case '+':
                            result += Double.parseDouble(s.charAt(i) + "");
                            break;
                        case '-':
                            result -= Double.parseDouble(s.charAt(i) + "");
                            break;
                    }
                    break;
                case '-', '+':
                    lastOperator = s.charAt(i);
            }
        }
        return result;
    }
}
