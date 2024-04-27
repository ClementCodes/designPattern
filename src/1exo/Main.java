public class Main {

    public static void main(String[] args) {
        duplicateCount("clement");
    }

    public static void duplicateCount(String text) {
        text.chars().forEach(c -> {
            long count = text.chars().filter(ch -> ch == c).count();
            if (count > 1) {
                System.out.println("La lettre " + (char) c + " se répète.");
            }
        });
    }
}
