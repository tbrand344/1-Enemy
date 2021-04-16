import java.util.*;

public class Main {
    
  public static void main (String[]args) {
        String heroName;
        int choice;
      
        Scanner input = new Scanner(System.in);
      
        Hero hero = new Hero(" ", 5, 2);
        Enemy goomba = new Enemy("Goomba", 2, 2, "Headbonk");
    
        System.out.println("Hey there Hero, what is your name?\n");
    
        hero.setName(input.nextLine());
      
        while(goomba.getHealth() != 0) {
            
            System.out.println("\tHP");
            System.out.println(goomba.getName() + ": " + goomba.getHealth() + "\n");
            
            System.out.println("What will you do, " + hero.getName());
            System.out.println("\t1. Attack");
            System.out.println("\t2. Heal");
            System.out.println("\t3. Run\n");
            
            choice = input.nextInt(); 
            switch(choice) {
                case 1: 
                    goomba.setHealth(goomba.getHealth() - hero.getAttack());
                    break;
                case 2: 
                    if(hero.getHealth() == 0)
                        System.out.println(hero.getName() + ", you have passed out.\nGAME OVER");
                    else if(hero.getHealth() < 5)
                        hero.setHealth(hero.getHealth() + 2);
                    else if(hero.getHealth() + 2 > 5)
                        hero.setHealth(5);
                    else if(goomba.getHealth() == 0)
                        System.out.println("\tVICTORY\nYou have deafeated the " + goomba.getName());
                    break;
                case 3:
                    System.out.println(hero.getName() + ", you run away.");
                    break;
                default:
                    System.out.println("Pick 1 of the three options.");
                    break;
            }
            System.out.println("\tVICTORY\nYou have deafeated the " + goomba.getName());
        }
    }
}
