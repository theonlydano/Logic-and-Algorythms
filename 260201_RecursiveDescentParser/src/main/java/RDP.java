public class RDP {
    private String string;

    public RDP(String s) {
        this.string = s.replaceAll(" ", "");
    }

    public double evaluate() throws RDPExeption{
        double result = 0;



        return 0;
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
        double result = 0;

        if(s.isEmpty()){
            throw new RDPExeption();
        }
        if(s.charAt(0) == '+' || s.charAt(0) == '-'){
            s = "0" + s;
        }

        int openedBracket = -1;
        int closedBracket = -1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                openedBracket = i;
            }
            if(s.charAt(i) == ')'){
                closedBracket = i;
                result += evaluateIntern(s.substring(openedBracket + 1, closedBracket));
            }
        }
        return 0;
    }
}
