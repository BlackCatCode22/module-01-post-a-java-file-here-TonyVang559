public class AwesomeJavaProgram5 {
    public static void main(String[] args) {

        printName("Sarah Surfer", 3);

    }

    private static String printName(String name, int number) {

        if (name.equals("Sarah Surfer")) {
            System.out.println("Sarah Surfer is the top three students");

        } else if (name.equals("Kenny")) {
            System.out.println("This guy is smart I assume");

        } else {
            System.out.println("I have no clue at all!");

        }

        return "My name is " + name;

    }

}

