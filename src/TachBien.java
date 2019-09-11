public class TachBien {
    public static void main(String[] args) {
        System.out.println(cleanCodeMethodFizzBuzz(5));
        System.out.println(cleanCodeMethodFizzBuzz(7));
        System.out.println(cleanCodeMethodFizzBuzz(9));
        System.out.println(cleanCodeMethodFizzBuzz(15));



    }

//    public static String fizzBuzz(int number) {
//        if (number % 3 == 0 && number % 5 == 0)
//            return "FizzBuzz";
//
//        if (number % 3 == 0)
//            return "Fizz";
//
//        if (number % 5 == 0)
//            return "Buzz";
//
//        return number + "";
//    }

    public static String cleanCodeMethodFizzBuzz(int number) {
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;

        if (isFizz && isBuzz)
            return "FizzBuzz";

        if (isFizz)
            return "Fizz";

        if (isBuzz)
            return "Buzz";

        return number + "";
    }
}
