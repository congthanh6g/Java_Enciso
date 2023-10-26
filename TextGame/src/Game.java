import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private Scanner scanner;
    private int choice;
    Player player;

    private boolean gameState;

    List<Weapon> weaponList;

    int number = 0;
    public Game() {
        scanner = new Scanner(System.in);
        choice = 0;
    }
    public void startGame() {
        player = new Player();
        weaponList = new ArrayList<>();
        System.out.println("Please enter your name:");
        player.setName(scanner.nextLine());
        player.setPlayerHP(15);

        System.out.println("Welcome " + player.getName() + " to the game");
        System.out.println("Player " + player.getName() + " HP : " + player.getPlayerHP());

        createWeapon();
        gameState = true;
    }

    public void createWeapon() {
        Weapon knife = new Weapon("knife", 5);
        Weapon sword = new Weapon("sword", 10);
        Weapon gun = new Weapon("gun", 100);
        weaponList.add(knife);
        weaponList.add(sword);
        weaponList.add(gun);
    }

    public void gameContent() {
        player.setPlayerHP(player.getPlayerHP());
        System.out.println("Your health is :" + player.getPlayerHP());


        System.out.println("You are at your house");
        System.out.println("There are 3 ways ahead. You can go to school, the mountain or the beach");
        System.out.println("Please choose your way");
        System.out.println("1. School");
        System.out.println("2. Mountain");
        System.out.println("3. Beach");

        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You go to school");
                System.out.println("You see a delinquent");

                Enemy deliquent = new Enemy(10, weaponList.get(0));
                System.out.println("Enemy has " + deliquent.getPlayerHP() + " equip with "
                + deliquent.getWeapon().name);

                System.out.println("You see 3 weapons");
                System.out.println("Please choose your weapon");
                System.out.println("1. Knife");
                System.out.println("2. Sword");
                System.out.println("3. Gun");
                choice = scanner.nextInt();
                switch(choice) {
                    case 1:
                        System.out.println("You choose the knife");
                        player.setWeapon(weaponList.get(0));

                        System.out.println("Player equip with " + player.getWeapon().name);
                    while (deliquent.getPlayerHP() > 0 && player.getPlayerHP() > 0) {

                        System.out.println("playerHP = " + player.getPlayerHP() + "enemyHP = " + deliquent.getPlayerHP() + gameState);

                        System.out.println("Player have 2 choices");
                        System.out.println("1. Attack");
                        System.out.println("2. Run");

                        choice = scanner.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("You attack the enemy");
                                deliquent.setPlayerHP(deliquent.getPlayerHP() - player.getWeapon().damage);
                                System.out.println("Enemy received the attack. Health : " + deliquent
                                        .getPlayerHP());

                                if (deliquent.getPlayerHP() <= 0) {
                                    System.out.println("The enemy has died");
                                    System.out.println("You win");
                                } else {
                                    System.out.println("The enemy attack you");
                                    player.setPlayerHP(player.getPlayerHP() - deliquent.getWeapon().damage);
                                    System.out.println("Player received the attack. Health : " + player
                                            .getPlayerHP());
                                }
                                if (player.getPlayerHP() <= 0) {
                                    System.out.println("You have died");
                                    System.out.println("Game over");
                                }
                                break;
                            case 2:
                                System.out.println("You have run away");
                                gameContent();
//                                when call new instance the old instance will wait after the new one finish and continue
//                                to prevent use return to delete the old instance
                                return;
                            default:
                                break;
                        }
                    }
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                System.out.println("You go to the mountain");
                break;
            case 3:
                System.out.println("You go to the beach");
                break;
            default:
                break;
        }
    }
}
