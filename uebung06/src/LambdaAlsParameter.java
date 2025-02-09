public class LambdaAlsParameter {
    @FunctionalInterface
    interface StringMethod{
        public abstract String run(String input);
    }

    public static void printFormatted(String string, StringMethod format){
        String result = format.run(string);
        System.out.println(result);
    }

    public static void main(String[] args) {
        StringMethod exclamation = (s)-> s + "!";
        StringMethod ask = (s) -> s + "?";
        printFormatted("Hello", exclamation);
        printFormatted("Hello", ask);
    }

}
