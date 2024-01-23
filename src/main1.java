public class main1 {
    public static void main(String[] args)  {
  //      int value = 2;
  //      if (value == 1) {
  //          System.out.println("value was 1");
  //      }   else if (value == 2)  {
  //          System.out.println("value was 2");
  //      }   else {
   //         System.out.println("was not 1 or 2");
  //      }
        int switchValue = 5;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                    System.out.println("Value was 2");
                    break;
            case 3: case 4: case 5:
                System.out.println("was a 3, a 4, or a 5");
                System.out.println("it was a " + switchValue);
               break;
            default:
                System.out.println("was not 1,2,3,4 or 5");
                break;

        }

    }
}
