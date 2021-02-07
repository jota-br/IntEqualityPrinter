public class IntEqualityPrinter {
    public static void printEqual(int x, int y, int j) {
        if((x < 0) || (y < 0) || (j < 0)){
            System.out.println("Invalid Value");
        } else if((x == y) && (x == j)) {
            System.out.println("All numbers are equal");
        } else if((x != y) && (x != j) && (y != j)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}