import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("unchecked")
public class ListCommand {
    private final Scanner scanner = new Scanner(System.in);
    private final List list = new ArrayList();

    public void execute() {
        list.clear();
        while (true) {
            showOutMenu();
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println(list);
                    break;

                case 2:
                    System.out.println(list.isEmpty());
                    break;

                case 3:
                    System.out.println(list.contains(scanner.next()));
                    break;

                case 4:
                    list.add(scanner.next());
                    break;

                case 5:
                    addIndex();
                    break;

                case 6:
                    System.out.println(list.get(scanner.nextInt()));
                    break;

                case 7:
                    list.remove(scanner.next());
                    break;

                case 8:
                    list.remove(scanner.nextInt());
                    break;

                case 9:
                    return;
            }
        }
    }

    private void addIndex() {
        System.out.println("Index");
        int n1 = scanner.nextInt();
        System.out.println("Object");
        String s = scanner.next();
        list.add(n1, s);
    }

    private void showOutMenu() {
        System.out.println("1.showItems - вывести список элементов коллекции");
        System.out.println("2.isEmpty - пуст ли список");
        System.out.println("3.contains - содержит ли коллекция элемент");
        System.out.println("4.add - добавление элемента в конец списка");
        System.out.println("5.addByIndex - добавление элемента на определенную позицию");
        System.out.println("6.getByIndex - получение элемента с определенной позиции");
        System.out.println("7.remove - удаление элемента");
        System.out.println("8.removeByIndex - удаление элемента, находящегося на определенной позиции");
        System.out.println("9.goToMainMenu - возврат в меню выбора коллекции");
    }
}
