package res;

public class Facility extends CrewMember implements Armor {
    private String name;
    @Override
    public int move(int speed, int distance) {
        return 0;
    }

    @Override
    public int dealDamage(int armor, int penetration) {
        return (penetration - armor) < 0 ? penetration - armor : penetration;
    }

    @Override
    public String say(String text) {
        return "Facility \"" + name + "\" said: " + text;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int reduceTakenDamage(int takenDamage, int armor) {
        return armor - takenDamage;
    }
}
