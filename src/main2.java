public class main2 {
    public static void main(String[] args)  {
       int value = 5;
      if (value == 1) {
            System.out.println("value was 1");
        }   else if (value == 2)  {
            System.out.println("value was 2");
        }   else {
            System.out.println("was not 1 or 2");
        }
        int switchValue = 5;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("was a 3, a 4, or a 5");
                System.out.println("it was a " + switchValue);
          }
          default -> System.out.println("was not 1,2,3,4 or 5");
      }


      String month = "XYZ ";
        System.out.println(month + "is in the " + getQuarter(month) + " quarter");

    }
        public static String getQuarter(String month)   {

            return switch (month) {
                case "january", "february", "march" -> { yield "1st"; }
                case "april", "may", "june" -> "2st";
                case "july", "august", "september" ->  "3rd";
                case "october", "november", "december" -> "4th";
                default ->   {
                    String badResponse = month + "is bad" ;
                    yield badResponse;
                }

            };
        }
}
