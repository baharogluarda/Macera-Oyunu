public class SafeHouse extends NormalLoc {


    public SafeHouse(Player player) {
        super(player, "Guvenli Ev");
    }

    @Override
    public boolean getLocation() {
        player.setHealthy(player.getrHealthy());
        System.out.println("İyilestiniz...");
        System.out.println("Suan Guvenli Ev adli yerdesiniz.");
        return true;
    }

}
