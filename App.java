public class App {
    public static void main(String[] args) {
        System.out.println( "holi holiii!");

        int x = 1;
        while (x <= 100) {

            if(x % 3 == 0 && x % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (x % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (x % 5 == 0) {
                System.out.println("Buzz");
            }  else {
                System.out.println(x);
            }
            x++;
        }

    }
}

