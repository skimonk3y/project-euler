/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package projecteuler;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        LatticePaths lp = new LatticePaths();
        final int result = lp.calculateRoutes(2);
        System.out.println(new App().getGreeting() + " " + result);
    }
}