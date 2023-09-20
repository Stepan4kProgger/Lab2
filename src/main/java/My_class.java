import res.Abrams;
import res.Facility;
import res.Howitzer;
import res.Merkava;
import res2.Inspection;
import res2.Registry;


import java.util.Scanner;

public class My_class {
    public static void main2(String[] args) {
        Abrams abrams = new Abrams();
        Merkava merkava = new Merkava();
        Facility facility = new Facility();
        int facilityArmor = 60;
        Howitzer howitzer = new Howitzer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название средства:");
        facility.setName(scanner.next());
        System.out.println(facility.say("Всем ку"));

        System.out.println("Введите сокрость первого танка");
        if (scanner.hasNextInt())
            System.out.println("Первый танк добрался до места за " + abrams.move(scanner.nextInt(), 100) +
                    " час(а)(ов)");
        System.out.println("Первый танк стреляет по средству!");
        System.out.println("Полученный средством урон: " + facility.reduceTakenDamage(abrams.dealDamage(facilityArmor,
                300), facilityArmor));

        System.out.println("Введите скорость доставки гаубицы");
        if (scanner.hasNextInt())
            System.out.println("Гаубица добралась до позиции за " + howitzer.move(scanner.nextInt(), 80) +
                    " час(а)(ов)");
        System.out.println("Гаубица стреляет!");
        System.out.println("Полученный средством урон: " + facility.reduceTakenDamage(howitzer.dealDamage(facilityArmor, 200), facilityArmor));

        System.out.println("Из-за угла выкатился второй танк!\nВторой танк стреляет по первому");
        System.out.println("Полученный первым танком урон: " + abrams.blockedDamage(280, merkava.dealDamage(80, 280)));
    }

    public static void main(String[] args) {
        Inspection.InitList();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        Registry.Identify(scan.next(), scan);
    }
}
