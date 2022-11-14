import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        List<String> listBay = new ArrayList<>();
        list.add("Хлеб");
        list.add("Масло");
        list.add("Колбаса");
        list.add("Молоко");
        list.add("Хлебные сухари");
        list.add("Хлебный квас");
        list.add("Рис");
        System.out.println();
        System.out.print("Список продкутов: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "; ");
        }
        System.out.println();
        while (true) {
            try {
                System.out.println("Выберите номер необходимой операции или введите end");
                System.out.println("Возможные операции: 1 - Добавить товар; 2 - Показать список; 3 - Удалить товра из списка ");
                String input = scanner.nextLine();

                if ("end".equals(input) || "End".equals(input) || "утв".equals(input) || "Утв".equals(input)) {
                    break;
                }
                int number = Integer.parseInt(input);
                if (number >= 4 || number <= 0) {
                    System.out.println("Необходимо ввести значения: 1, 2 или 3 ");
                    System.out.println();
                    continue;
                }
                if (number == 1) {
                    System.out.println();
                    System.out.print("Какую покупку хотите добавить из списка (название):");

                    for (int i = 0; i < list.size(); i++) {
                        System.out.print(list.get(i) + "; ");
                    }
                    System.out.println();
                    String name = scanner.nextLine();
                    int n = 0;
                    for (String s : list) {
                        if (name.equals(s)) {
                            listBay.add(name);
                            System.out.println("Итого в списке покупок: " + listBay.size());
                            //continue;
                        } else {
                            n++;
                        }

                    }

                    if ((n) == list.size()) {
                        System.out.println("Товар не из списка. Выберите товар из списка");
                    }


                    System.out.println();
                }
                if (number == 2) {
                    System.out.println();
                    System.out.println("Список покупок:");
                    for (int i = 0; i < listBay.size(); i++) {
                        System.out.println("№" + (i + 1) + ". " + listBay.get(i) + "; ");

                    }
                    System.out.println();
                    continue;


                }

                if (number == 3) {

                    System.out.println("Список покупок:");
                    for (int i = 0; i < listBay.size(); i++) {
                        System.out.println("№" + (i + 1) + ". " + listBay.get(i) + "; ");
                    }
                    System.out.println("Какую покупку хотите удалить? Введите номер или название");
                    System.out.println();
                    String remove = scanner.nextLine();
                    try {
                        int x = Integer.parseInt(remove);
                        for (int r = 0; r < listBay.size(); r++) {

                            if (x == (r + 1)) {
                                String removeProduct = listBay.get(r);
                                listBay.remove(r);
                                System.out.println("Покупка " + '"' + removeProduct + '"' + " удалена, список покупок:");
                            }
                        }
                    } catch (NumberFormatException e) {

                        for (int i = 0; i < listBay.size(); i++) {
                            String product = listBay.get(i);
                            if (remove.equals(product)) {
                                listBay.remove(remove);
                                System.out.println("Покупка " + '"' + product + '"' + " удалена, список покупок:");

                            }
                        }
                    }


                    for (int i = 0; i < listBay.size(); i++) {
                        System.out.println("№" + (i + 1) + ". " + listBay.get(i) + "; ");

                    }

                }


                System.out.println();

            } catch (NumberFormatException e) {
                System.out.println("Введены не корректные данные !!!");
                System.out.println();
                continue;
            }

        }
    }
}


