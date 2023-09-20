package res2;

import java.util.Scanner;

public class Registry {
    public static void Identify(String name, Scanner scan) {
        System.out.println("Добро пожаловать, " + name);
        System.out.println("Что бы вы хотели сделать?\n" +
                "1 - Проверить счёт\n" +
                "2 - Взять кредит\n" +
                "0 - Выйти");
        int opt = scan.nextInt();
        if (opt == 0)
            System.out.println("Удачи, " + name);
        Banker.Operation(name, opt, scan);
    }
}
