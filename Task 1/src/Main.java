import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isCanCook = false;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество жабьих глаз: ");
        int toadEyesCount = scanner.nextInt();

        System.out.print("Введите количество слез вурдалака: ");
        int ghoulTearsCount = scanner.nextInt();

        System.out.print("Введите количество костей ворона: ");
        int ravenBonesCount = scanner.nextInt();

        System.out.print("Введите количество пельменей: ");
        int dumplingsCount = scanner.nextInt();

        //todo реализовать ввод пользователем кол-ва ингредиентов.

        System.out.println("""
                Рецепты Эликсиров:
                1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
                2. 2 кости ворона + 4 пельменя - Эликсир стойкости
                3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
                4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир""");

        //todo дописать логику программы сюда

        if (toadEyesCount >= 3 && ravenBonesCount >= 1) {
            isCanCook = true;
            System.out.println("Вы сможете приготовить эликсир зоркости");
        }
        if (ravenBonesCount >= 2 && dumplingsCount >= 4) {
            isCanCook = true;
            System.out.println("Вы сможете приготовить эликсир стойкости");
        }
        if (ghoulTearsCount >= 7 && dumplingsCount >= 1 && toadEyesCount >= 2) {
            isCanCook = true;
            System.out.println("Вы сможете приготовить эликсир скрытности");
        }
        if (ghoulTearsCount >= 5 && dumplingsCount >= 10 && toadEyesCount >= 4 && ravenBonesCount >= 3) {
            isCanCook = true;
            System.out.println("Вы сможете приготовить запретный эликсир");
        }
        if (!isCanCook) {
            System.out.println("У вас не хватает ингредиентов");
        }
    }
}
