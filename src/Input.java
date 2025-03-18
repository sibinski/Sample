import static java.lang.System.out;

public static void main() throws IOException {
    out.println("Please enter your name: ");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    out.println("Hello, " + name + "!");
    println("What is your age?");
    int age = Integer.parseInt(scanner.next());
    out.println("Your age is: " + age + " years old.");
    scanner.close();
}
