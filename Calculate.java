class Calculate {
    // static method to calculate cube
    static int cube(int x) {
        return x * x * x;
    }

    public static void main(String[] args) {
        int result = Calculate.cube(5);  // call static method using class name
        System.out.println(result);
    }
}