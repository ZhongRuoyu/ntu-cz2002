package exam.ay2021s2.Q2a;

class TestClass {
    private double price;
    private String name;
    static int numberOfProduct = 0;

    // definition of TestClass constructor
    public TestClass(String name) {
        this.price = 0.0;
        this.name = name;
        ++numberOfProduct;
    }

    public static void greetings() {
        // definition of greetings from TestClass
        System.out.println("Hello, welcome to out product line.");
    }

    public void update(double price, String name) {
        // definition of update
        this.price = price;
        this.name = name;
    }

    public void print() {
        // definition of print
        System.out.println(name + ": costs S$" + price);
    }

    public void printNumberOfProduct() {
        // definition of printNumberOfProduct
        System.out.println("number = " + numberOfProduct);
    }
}
