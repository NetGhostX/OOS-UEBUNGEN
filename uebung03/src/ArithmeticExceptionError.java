public class ArithmeticExceptionError {
    public static void main(String[] args) {
        int testNumber = 3;

        ArithmeticExceptionError arithmeticExceptionError = new ArithmeticExceptionError();
        try {
            arithmeticExceptionError.notEvenNumber(testNumber);
        } catch (ArithmeticException e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }

    public void notEvenNumber(int number) throws ArithmeticException {
        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            throw new ArithmeticException("Number is odd and invalid for this operation");
        }
    }
}
