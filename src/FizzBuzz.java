public class FizzBuzz {
//    public static String fizzBuzz(int number){
//        boolean isFizz = number % 3 == 0;
//        boolean isBuzz = number % 5 == 0;
//        if (isFizz && isBuzz)
//            return "FizzBuzz";
//        if (isFizz)
//            return "Fizz";
//        if (isBuzz)
//            return "Buzz";
//        return number + "";
//    }
    public static String fizzBuzz(int number) {
        if (number <= 0 || number >= 100) {
            return "Out of range";
        }
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0 || number / 10 == 3 || number % 10 == 3) {
            return "Fizz";
        } else if (number % 5 == 0 || number / 10 == 5) {
            return "Buzz";
        } else {
            return numberToString(number);
        }
    }
    private static String numberToString(int number) {
        int tens = number / 10;
        int ones = number % 10;
        String numberString = "";
        if (tens == 1) {
            switch (ones) {
                case 0:
                    numberString = "Ten";
                    break;
                case 1:
                    numberString = "Eleven";
                    break;
                case 2:
                    numberString = "Twelve";
                    break;
                case 3:
                    numberString = "Thirteen";
                    break;
                case 4:
                    numberString = "Fourteen";
                    break;
                case 5:
                    numberString = "Fifteen";
                    break;
                case 6:
                    numberString = "Sixteen";
                    break;
                case 7:
                    numberString = "Seventeen";
                    break;
                case 8:
                    numberString = "Eighteen";
                    break;
                case 9:
                    numberString = "Nineteen";
            }
        } else {
            switch (tens) {
                case 2:
                    numberString = "Twenty";
                    break;
                case 3:
                    numberString = "Thirty";
                    break;
                case 4:
                    numberString = "Forty";
                    break;
                case 5:
                    numberString = "Fifty";
                    break;
                case 6:
                    numberString = "Sixty";
                    break;
                case 7:
                    numberString = "Seventy";
                    break;
                case 8:
                    numberString = "Eighty";
                    break;
                case 9:
                    numberString = "Ninety";
            }
            if (!numberString.equals("")) numberString += " ";
            switch (ones) {
                case 1:
                    numberString += "One";
                    break;
                case 2:
                    numberString += "Two";
                    break;
                case 3:
                    numberString += "Three";
                    break;
                case 4:
                    numberString += "Four";
                    break;
                case 5:
                    numberString += "Five";
                    break;
                case 6:
                    numberString += "Six";
                    break;
                case 7:
                    numberString += "Seven";
                    break;
                case 8:
                    numberString += "Eight";
                    break;
                case 9:
                    numberString += "Nine";
                    break;
            }
        }

        return numberString;
    }
}
