import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

@SuppressWarnings("unchecked")
public class SetCommand {
    private final Scanner scanner = new Scanner(System.in);
    private final Set set = new HashSet();

    void execute() {
        set.clear();
        while (true) {
            showOutMenu();
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println(set);
                    break;

                case 2:
                    System.out.println(set.isEmpty());
                    break;

                case 3:
                    System.out.println(set.contains(scanner.next()));
                    break;

                case 4:
                    set.add(scanner.next());
                    break;

                case 5:
                    set.remove(scanner.next());
                    break;

                case 6:
                    return;
            }
        }
    }

    private void showOutMenu() {
        System.out.println("1.showItems - вывести список элементов коллекции");
        System.out.println("2.isEmpty - пуст ли список");
        System.out.println("3.contains - содержит ли коллекция элемент");
        System.out.println("4.add - добавление элемента в конец списка");
        System.out.println("5.remove - удаление элемента");
        System.out.println("6.goToMainMenu - возврат в меню выбора коллекции");
    }
}
