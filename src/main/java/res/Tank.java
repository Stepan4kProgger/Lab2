package res;

public abstract class Tank implements Mobility {
    abstract int blockedDamage(int penetration, int damage);
}
