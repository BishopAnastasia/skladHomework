import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

import static java.lang.System.exit;

public class Method {
    public static void main(String[] args) {
        List<Sklad> list = new ArrayList<Sklad>(7);

        Sklad product1 = new Sklad(1, "хлеб");
        Sklad product2 = new Sklad(2, "молоко");
        Sklad product3 = new Sklad(3, "кефир");
        Sklad product4 = new Sklad(4, "масло");
        Sklad product5 = new Sklad(5, "колбаса");

        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        list.add(product5);

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Добавить продукт на склад");
            System.out.println("2. Показать продукты на складе");
            System.out.println("3. Проверить наличие продукта на складе");
            System.out.println("4. Удалить продукт со склада");
            System.out.println("5. Проверить количество продукта на складе");
            System.out.println("6. Выйти");
            System.out.println("Выберите действие и напишите номер: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите номер продукта: ");
                    int prnum = sc.nextInt();
                    System.out.print("Введите название продукта: ");
                    String nameProduct = sc1.nextLine();

                    list.add(new Sklad(prnum, nameProduct));
                break;

                case 2:
                    System.out.println("----------");
                    Iterator<Sklad> i = list.iterator();
                    while (i.hasNext()) {
                        Sklad e = i.next();
                        System.out.println(e);
                    }
                    System.out.println("----------");
                break;

                case 3:
                    boolean contain = false;
                    System.out.println("Введите номер продукта для поиска на складе: ");
                    prnum = sc.nextInt();
                    System.out.println("----------");
                    i = list.iterator();
                    while (i.hasNext()) {
                        Sklad e = i.next();
                        if (e.getProductNumber() == prnum) {
                            System.out.println(e);
                            contain = true;}
                        }
                    if(!contain) {
                        System.out.println("Не найдено");
                    }
                    System.out.println("----------");
                break;

                case 4:
                    contain = false;
                    System.out.println("Введите номер продукта для удаления со склада: ");
                    prnum = sc.nextInt();
                    System.out.println("----------");
                    i = list.iterator();
                    while (i.hasNext()) {
                        Sklad e = i.next();
                        if (e.getProductNumber() == prnum) {
                            i.remove();
                            contain = true;}
                    }
                    if(!contain) {
                        System.out.println("Не найдено");
                    } else{
                        System.out.println("Удаление прошло успешно");}
                    System.out.println("----------");
                break;

                case 5:
                    System.out.println("----------");
                    System.out.println("На складе " + list.size() + " продуктов");
                    System.out.println("----------");
                break;



                case 6:
                    System.out.println("--------------------");
                    System.out.println("Вы вышли со склада");
                    System.out.println("--------------------");
                    System. exit(0);

                default:
                    System.out.println("--------------------");
                    System.out.println("Вы ввели недопустимую команду");
                    System.out.println("--------------------");


            }


            }
            while (choice != 6) ;


        }
    }

