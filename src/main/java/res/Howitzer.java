package res;

public class Howitzer implements Mobility {
    private final int basicDamage = 150;

    @Override
    public int move(int speed, int distance) { //returns spent time
        System.out.println("Howitzer moved ");
        return speed / distance;
    }

    @Override
    public int dealDamage(int armor, int penetration) {
        return basicDamage - armor > penetration ? armor - penetration : 0;
    }
}
