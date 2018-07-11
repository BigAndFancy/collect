import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapCommand {
    private final Scanner scanner = new Scanner(System.in);
    private final Map map = new HashMap();

    void execute() {
        map.clear();
        while (true) {
            showOutMenu();
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println(map);
                    break;

                case 2:
                    System.out.println(map.isEmpty());
                    break;

                case 3:
                    map.get(scanner.nextInt());
                    break;

                case 4:
                    System.out.println(map.put(scanner.nextInt(), scanner.next()));
                    break;

                case 5:
                    map.remove(scanner.nextInt());
                    break;

                case 6:
                    return;
            }
        }
    }

    private void showOutMenu() {
        System.out.println("1.showItems - вывести список элементов коллекции");
        System.out.println("2.isEmpty - пуст ли список");
        System.out.println("3.get - получение элемента коллекции, либо null в случае отсутсвия");
        System.out.println("4.put - добавление элемента в коллекцию");
        System.out.println("5.remove - удаление элемента");
        System.out.println("6.goToMainMenu - возврат в меню выбора коллекции");
    }
}
