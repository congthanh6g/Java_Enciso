public class Player extends Entity {
    private String name;

    public Player(){}
    public Player(int playerHP, Weapon weapon, String name) {
        super(playerHP, weapon);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
