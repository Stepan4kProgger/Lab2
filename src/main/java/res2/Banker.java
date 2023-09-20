package res2;

import java.util.Scanner;

public class Banker {
    public static void Operation(String name, int opt, Scanner scan){
        if (opt == 1) {
            int defaultOpt = -999;
            int res = Inspection.getValue(name);
            if (res != defaultOpt){
                System.out.println("Состояние вашего счёта: " + res);
            }
            else System.out.println("Информации по вашему счёту не найдено");
        }
        if (opt == 2){
            int defaultOpt = -999;
            int res = Inspection.getValue(name);
            if (res != defaultOpt){
                if (res >= 0) {
                    System.out.println("Введите сумму кредита (не более 1000)");
                    int sum = scan.nextInt();
                    if (1 < sum && sum <= 1000) {
                        System.out.println(name + ", вам одобрен кредит на сумму " + sum);
                    }
                    else
                        System.out.println("В кредите отказано");
                }
                else {
                    System.out.println("В кредите отказано. На вашем счету отрицательный баланс");
                }
            }
            else System.out.println("Информации по вашему счёту не найдено. Зарегистрируйтесь");
        }
    }
}
