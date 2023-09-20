package res;

public interface Armor extends Weapon {
    abstract int reduceTakenDamage(int takenDamage, int armor);
}
