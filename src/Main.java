import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.age = 2;
        cat.weight = 12;
        cat.coatColor = "Черный";
        Scanner sc = new Scanner(System.in);
        System.out.println("Возраст кота" + ": " + cat.age + " " + "года");
        System.out.println("Вес кота" + ": " + cat.weight + " " + "кг");
        System.out.println("Цвет шерсти" + ": " + cat.coatColor);
        System.out.println("Что делает кот" +":"+ " " + cat.doing());
        System.out.println("Кот спрашивает вас, принесли ли вы еду?");
        System.out.println("Ваш ответ:");
        cat.anwesr = sc.nextLine();
        System.out.println("Кот отвечает: " + cat.Action());



        Dog dog = new Dog();
        dog.age = 3;
        dog.weight = 20;
        dog.coatColor = "Белый";
        System.out.println("Возраст пса" + ": " + dog.age + " " + "года");
        System.out.println("Вес пса" + ": " + dog.weight + " " + "кг");
        System.out.println("Цвет шерсти" + ": " + dog.coatColor);
        System.out.println("Что делает пес" +":"+ " " + dog.doing());
        System.out.println("Пес спрашивает вас, принесли ли вы еду?");
        System.out.println("Ваш ответ:");
        dog.anwesr = sc.nextLine();
        System.out.println("Пес отвечает: " + dog.Action());


    }
}
