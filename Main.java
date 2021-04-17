import java.util.*;

public class Main {
    
    public static void main (String[]args) {
        String heroName;
        int choice = 0;
        int enemy = 0;
      
        Scanner input = new Scanner(System.in);
      
        Hero hero = new Hero(" ", 5, 2, "Hammer Time");
        Enemy enemy1 = new Enemy("Goomba", 2, 2, "Headbonk");
        Enemy enemy2 = new Enemy("Koopa", 4, 2, "Shell Toss");
        Enemy enemy3 = new Enemy("Bowser", 10, 3, "Fire Breath");
    
        System.out.println("\n\n\t\tEnemy Rumble\n");
    
        System.out.println("\tHey there Hero, what is your name?\n");
    
        hero.setName(input.nextLine());
      
        System.out.print("\n\t" + hero.getName() + ", choose your enemy: ");
        
        System.out.println("\n\t\t1. Pawn level\n\t\t2. Intermediate Level\n\t\t3. Boss Level");
        
        enemy = input.nextInt();
        
        switch(enemy) {
            case 1:
                    while(enemy1.getHealth() != 0 && choice != 3) {
            
                        System.out.println("=====================================================");
            
                        System.out.println("\t\tHP");
                        System.out.println("\t" + enemy1.getName() + ": " + enemy1.getHealth() + "\n\n");
            
                        System.out.println("\t\tHP");
                        System.out.println("\t" + hero.getName() + ":    " + hero.getHealth() + "\n\n");
            
                        System.out.println("\tWhat will you do, " + hero.getName());
                        System.out.println("\t\t1. Attack");
                        System.out.println("\t\t2. Heal");
                        System.out.println("\t\t3. Run\n");
            
                        System.out.println("======================================================\n");
            
                        System.out.print("\tOption chosen: ");
            
                        choice = input.nextInt(); 
            
                        switch(choice) {
                            case 1: 
                                enemy1.setHealth(enemy1.getHealth() - hero.getAttack());
                    
                                System.out.println("\t" + hero.getName() + " use " + hero.getAttackName() + ".\n");
                                System.out.println("\t" + enemy1.getName() + " take " + hero.getAttack() + " damage.\n"); 
                                System.out.println("\t" + enemy1.getName() + " use " + enemy1.getAttackName() + ".\n");
                                System.out.println("\t" + hero.getName() + " take " + enemy1.getAttack() + " damage.\n");
                                break;
                            case 2: 
                                hero.setHealth(5);
                                System.out.println("\tHealth restored to max\n");
                                break;
                            case 3:
                                System.out.println("\t" + hero.getName() + ", you run away.\n");
                                break;
                            default:
                                System.out.println("\tPick 1 of the three options " + hero.getName() + ".\n");
                                break;
                        }
                    }
                    if(choice == 3) {
                        System.out.println("\tYou have done your best, " + hero.getName());
                    }
                    if(enemy1.getHealth() == 0) {
                        System.out.println("\t\tHP");
                        System.out.println("\t" + enemy1.getName() + ": " + enemy1.getHealth() + "\n\n");
            
                        System.out.println("\t\t!!VICTORY!!\n\tYou have deafeated the " + enemy1.getName() + ".");
            
                        System.out.println("=====================================================");
                    }
                    break;
            case 2:
                while(enemy2.getHealth() != 0 && choice != 3) {
            
                        System.out.println("=====================================================");
            
                        System.out.println("\t\tHP");
                        System.out.println("\t" + enemy2.getName() + ":  " + enemy2.getHealth() + "\n\n");
            
                        System.out.println("\t\tHP");
                        System.out.println("\t" + hero.getName() + ":    " + hero.getHealth() + "\n\n");
            
                        System.out.println("\tWhat will you do, " + hero.getName());
                        System.out.println("\t\t1. Attack");
                        System.out.println("\t\t2. Heal");
                        System.out.println("\t\t3. Run\n");
            
                        System.out.println("======================================================\n");
            
                        System.out.print("\tOption chosen: ");
            
                        choice = input.nextInt(); 
            
                        switch(choice) {
                            case 1: 
                                enemy2.setHealth(enemy2.getHealth() - hero.getAttack());
                    
                                System.out.println("\t" + hero.getName() + " use " + hero.getAttackName() + ".\n");
                                System.out.println("\t" + enemy2.getName() + " take " + hero.getAttack() + " damage.\n"); 
                                System.out.println("\t" + enemy2.getName() + " use " + enemy2.getAttackName() + ".\n");
                                System.out.println("\t" + hero.getName() + " take " + enemy2.getAttack() + " damage.\n");
                                
                                hero.setHealth(hero.getHealth() - enemy2.getAttack());
                                break;
                            case 2:
                                hero.setHealth(5);
                                System.out.println("\tHealth restored to max\n");
                                break;
                            case 3:
                                System.out.println("\t" + hero.getName() + ", you run away.\n");
                                break;
                            default:
                                System.out.println("\t" + "Pick 1 of the three options " + hero.getName() + ".\n");
                                break;
                        }
                    }
                    if(choice == 3) {
                        System.out.println("\t" + "You have done your best, " + hero.getName());
                    }
                    if(enemy2.getHealth() == 0) {
                        System.out.println("\t\tHP");
                        System.out.println("\t" + enemy2.getName() + ": " + enemy2.getHealth() + "\n\n");
            
                        System.out.println("\t\t!!VICTORY!!\n\tYou have deafeated the " + enemy2.getName() + ".");
            
                        System.out.println("=====================================================");
                    }
                    break;
            case 3:
                while(enemy3.getHealth() != 0 && choice != 3) {
            
                        System.out.println("=====================================================");
            
                        System.out.println("\t\tHP");
                        System.out.println("\t" + enemy3.getName() + ": " + enemy3.getHealth() + "\n\n");
            
                        System.out.println("\t\tHP");
                        System.out.println("\t" + hero.getName() + ":    " + hero.getHealth() + "\n\n");
            
                        System.out.println("\tWhat will you do, " + hero.getName());
                        System.out.println("\t\t1. Attack");
                        System.out.println("\t\t2. Heal");
                        System.out.println("\t\t3. Run\n");
            
                        System.out.println("======================================================\n");
            
                        System.out.print("\tOption chosen: ");
            
                        choice = input.nextInt(); 
            
                        switch(choice) {
                            case 1: 
                                enemy3.setHealth(enemy3.getHealth() - hero.getAttack());
                    
                                System.out.println("\t" + hero.getName() + " use " + hero.getAttackName() + ".\n");
                                System.out.println("\t" + enemy3.getName() + " take " + hero.getAttack() + " damage.\n"); 
                                System.out.println("\t" + enemy3.getName() + " use " + enemy3.getAttackName() + ".\n");
                                System.out.println("\t" + hero.getName() + " take " + enemy3.getAttack() + " damage.\n");
                                
                                hero.setHealth(hero.getHealth() - enemy3.getAttack());
                                break;
                            case 2:
                                hero.setHealth(5);
                                System.out.println("\tHealth restored to max\n");
                                break;
                            case 3:
                                System.out.println("\t" + hero.getName() + ", you run away.\n");
                                break;
                            default:
                                System.out.println("\tPick 1 of the three options " + hero.getName() + ".\n");
                                break;
                        }
                    }
                    if(choice == 3) {
                        System.out.println("\tYou have done your best, " + hero.getName());
                    }
                    if(enemy3.getHealth() == 0) {
                        System.out.println("\t\tHP");
                        System.out.println("\t" + enemy3.getName() + ": " + enemy3.getHealth() + "\n\n");
            
                        System.out.println("\t\t!!VICTORY!!\n\tYou have deafeated the " + enemy3.getName() + ".");
            
                        System.out.println("=====================================================");
                    }
                    break;
                } 
        }
}
