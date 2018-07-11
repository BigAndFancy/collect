import java.util.Scanner;

public class Main {
    private static ListCommand listCommand = new ListCommand();
    private static SetCommand setCommand = new SetCommand();
    private static DequeCommand dequeCommand = new DequeCommand();
    private static MapCommand mapCommand = new MapCommand();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            showOutMenu();
            switch (scanner.nextInt()) {
                case 1:
                    listCommand.execute();
                    break;

                case 2:
                    setCommand.execute();
                    break;

                case 3:
                    dequeCommand.execute();
                    break;

                case 4:
                    mapCommand.execute();
                    break;

                default:
                    return;
            }
        }
    }

    private static void showOutMenu() {
        System.out.println("1.List");
        System.out.println("2.Set");
        System.out.println("3.Deque");
        System.out.println("4.Map");
    }
}
