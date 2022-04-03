public class Main {
    public static void main(String[] args){
        Player1 player=new Player1("Radhika", "sword", 100);
//        System.out.println(player.getName());
//        System.out.println(player.getHealth());
//        System.out.println(player.getWeapon());

        Player2 betterplayer=new Player2("Sam","Machine gun",500,true);
        betterplayer.damagebyGun1();
        player.damagebyGun2();
        player.heal();
    }
}
