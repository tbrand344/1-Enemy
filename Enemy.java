public class Enemy {
 
    private String name;
    private int health;
    private int attack;
    private String attackName;
    
    public Enemy(String name, int health, int attack, String attackName) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.attackName = attackName;
    }
    
    public String setName(String enemyName) {
        name = enemyName;
        return name;
    }
    
    public String getName() {
        return name;
    }
    
    public int setHealth(int healthPoints) {
        health = healthPoints;
        return health;
    }
    
    public int getHealth() {
        return health;
    }
    
    public int setAttack(int attackPoints) {
        attack = attackPoints;
        return health;
    }
    
    public int getAttack() {
        return attack;
    }
    
    public String attackName() {
        return attackName;
    }
}

