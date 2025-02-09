public class Main {
    public static void main(String[] args) {

        LambdaExpression add = ((x1, y1, z1) -> {
            return x1 + y1 == z1;
        });

        LambdaExpression multi = ((x1, y1, z1) -> {
            return x1*y1==z1;
        });

        LambdaExpression divide = ((x1, y1, z1) -> {
           return x1/y1==z1;

        });

        LambdaExpression sub = ((x1, y1, z1) -> {
           return x1-y1 ==z1;
        });


        System.out.println("Add: " + add.arithmeticOperations(4,5,9));
        System.out.println("Multi: " + add.arithmeticOperations(4,5,6));
        System.out.println("divide: " + add.arithmeticOperations(4,5,6));
        System.out.println("sub: " + add.arithmeticOperations(4,5,6));
    }
}
