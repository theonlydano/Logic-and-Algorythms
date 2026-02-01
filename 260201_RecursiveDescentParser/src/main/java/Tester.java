public class Tester {
    public static void main(String[] args) {
        //RDP parser = new RDP("-((4+5)*2)*(3+1)");
        RDP parser = new RDP("2^2^2");
        /*
            // These expressions should cause an exception...
            RDParser parser = new RDParser("-((4+5)2)*(3+1)");
            RDParser parser = new RDParser("-((4+5)*2*(3+1)");
            RDParser parser = new RDParser("((4x+5)*2)*(3+1)");
         */
        try {
            System.out.println(parser.evaluate());
        } catch(RDPExeption e) { e.printStackTrace(); }

    }
}
