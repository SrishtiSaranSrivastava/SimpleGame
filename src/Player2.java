public class Player2 extends Player1{
    private int health;
    private boolean armour;

    public Player2(String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);
        this.health = health;
        this.armour = armour;
    }

    @Override
    public void damagebyGun1() {
        if(armour){
            health -= 20;
            if(this.health<=0)
                this.health=0;
            System.out.println("Armour is on. Hit by gun1. Health reduced by 20. New health is "+this.health);
        }
        if (!armour){
            health -= 30;
            if(this.health<=0)
                this.health=0;
            System.out.println("Armour is off. Hit by gun1. Health reduced by 30. New health is "+this.health);
        }
        if(health==0){
            System.out.println("Player is dead.");
        }
    }

    @Override
    public void damagebyGun2() {
        if(armour){
            health -= 40;
            if(this.health<=0)
                this.health=0;
            System.out.println("Armour is on. Hit by gun1. Health reduced by 40. New health is "+this.health);
        }
        if (!armour){
            health -= 50;
            if(this.health<=0)
                this.health=0;
            System.out.println("Armour is off. Hit by gun1. Health reduced by 50. New health is "+this.health);
        }
        if(health==0){
            System.out.println("Player is dead.");
        }
    }

    @Override
    public void heal() {

    }
}
