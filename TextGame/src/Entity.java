public class Entity {
    private int playerHP;
    private Weapon weapon;

    public Entity() {
    }

    public Entity(int playerHP, Weapon weapon) {
        this.playerHP = playerHP;
        this.weapon = weapon;
    }

    public int getPlayerHP() {
        return playerHP;
    }

    public void setPlayerHP(int playerHP) {
        this.playerHP = playerHP;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
