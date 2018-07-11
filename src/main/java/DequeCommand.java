import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

@SuppressWarnings("unchecked")
public class DequeCommand {
    private final Scanner scanner = new Scanner(System.in);
    private final Deque deque = new ArrayDeque();

    void execute() {
        deque.clear();
        while (true) {
            showOutMenu();
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println(deque);
                    break;

                case 2:
                    System.out.println(deque.isEmpty());
                    break;

                case 3:
                    System.out.println(deque.contains(scanner.next()));
                    break;

                case 4:
                    deque.addFirst(scanner.next());
                    break;

                case 5:
                    deque.addLast(scanner.next());
                    break;

                case 6:
                    System.out.println(deque.getFirst());
                    break;

                case 7:
                    System.out.println(deque.getLast());
                    break;

                case 8:
                    System.out.println(deque.pollFirst());
                    break;

                case 9:
                    System.out.println(deque.pollLast());
                    break;

                case 10:
                    deque.removeFirst();
                    break;

                case 11:
                    deque.removeLast();
                    break;

                case 12:
                    return;
            }
        }
    }

    private void showOutMenu() {
        System.out.println("1.showItems - вывести список элементов коллекции");
        System.out.println("2.isEmpty - пуст ли список");
        System.out.println("3.contains - содержит ли коллекция элемент");
        System.out.println("4.addFirst - добавление элемента в начало коллекции");
        System.out.println("5.addLast - добавление элемента в конец коллекции");
        System.out.println("6.getFirst - получение первого элемента при этом не удаляя его из самой коллекции");
        System.out.println("7.getLast - получение последнего элемента при этом не удаляя его из самой коллекции");
        System.out.println("8.pollFitst - получение первого элемента при этом удаляя его из самой коллекции");
        System.out.println("9.pollLast - получение последнего элемента при этом удаляя его из самой коллекции");
        System.out.println("10.removeFirst - удалить элемент из начала списка");
        System.out.println("11.removeLast - удалить элемент из конца списка");
        System.out.println("12.goToMainMenu - возврат в меню выбора коллекции");
    }
}
