import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int money;
    private String charName;
    private String name;
    private Scanner input = new Scanner(System.in);


    public Player(String name) {
        this.name = name;
    }

    public void selectChar() {
        GameCharacter[] characterList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("Characters: ");
        System.out.println("-------------------------------");
        for (GameCharacter gameCharacter : characterList) {
            System.out.println("ID : " + gameCharacter.getId() + "\t" +
                    gameCharacter.getName() + "\t\t---->" +
                    "\t\t Damage: " + gameCharacter.getDamage() +
                    "\t\t Health: " + gameCharacter.getHealth() +
                    "\t\t Money: " + gameCharacter.getMoney());
        }
        System.out.println("------------------------------------");
        System.out.println("Please enter the ID of the character you want to select!: ");
        int selectCharacter = input.nextInt();
        switch (selectCharacter) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }
        System.out.println("Character: " + this.getCharName() +
                " --> Damage: " + this.getDamage() +
                ", Health: " + this.getHealth() +
                ", Money: " + this.getMoney());
    }

    public void initPlayer(GameCharacter gameCharacter) {
        this.setDamage(gameCharacter.getDamage());
        this.setHealth(gameCharacter.getHealth());
        this.setMoney(gameCharacter.getMoney());
        this.setCharName(gameCharacter.getName());
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
