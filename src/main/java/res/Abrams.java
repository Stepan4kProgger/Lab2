package res;

public class Abrams extends Tank {
    final int armor = 80;
    final int basicDamage = 55;

    @Override
    public int blockedDamage(int penetration, int damage) {
        return penetration > armor ? damage : 0;
    }

    @Override
    public int move(int speed, int distance) {
        System.out.println("Tank moved");
        return (int) (speed * 1.2 / distance);
    }

    @Override
    public int dealDamage(int armor, int penetration) {
        return basicDamage - armor > penetration ? armor - penetration : 0;
    }
}
