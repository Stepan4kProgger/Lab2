package res;

public class Merkava extends Tank {
    final int armor = 85;
    final int basicDamage = 45;

    @Override
    public int blockedDamage(int penetration, int damage) {
        return penetration > armor ? damage : 0;
    }

    @Override
    public int move(int speed, int distance) {
        System.out.println("Tank moved");
        return (int) (speed * 1.3 / distance);
    }

    @Override
    public int dealDamage(int armor, int penetration) {
        return basicDamage - armor > penetration ? armor - penetration : 0;
    }
}
