public class main3 {
    public static void main (String[] args) {

        char charValue = 'X';
        switch (charValue) {
            case 'A':
                System.out.println("able");
                break;
            case 'B':
                System.out.println("baker");
                break;
            case 'C':
                System.out.println("charlie");
                break;
            case 'D':
                System.out.println("dog");
                break;
            case 'E':
                System.out.println("easy");
                break;
            default:
                System.out.println("Letter " + charValue + " was not found in the switch");
        }
    }
}
