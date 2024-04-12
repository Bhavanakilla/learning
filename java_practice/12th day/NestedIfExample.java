class NestedIfExample {
    public static void main(String[] args) {
        int x = 30;
        int y = 10;

        // Check if x is greater than 20
        if (x > 20) {
            System.out.println("x is greater than 20");

            // Nested if: Check if y is greater than 5
            if (y > 5) {
                System.out.println("y is greater than 5");
            }
        }
    }
}