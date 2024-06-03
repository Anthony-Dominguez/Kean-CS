class BowlingAlley {

}



class StandardBowlingAlley extends BowlingAlley {
    private int laneLength;
    public StandardBowlingAlley(){
        super();
        this.laneLength = 0;

    }
    public StandardBowlingAlley(String name , int numOfLanes, int laneLength){
        super(name,numOfLanes);
        this.laneLength = laneLength;

    }
    public StandardBowlingAlley(StandardBowlingAlley other){
        super(other);
        this.laneLength = other.laneLength;
    }


    public int getLaneLength(){
        return laneLength;
    }


    public void setLaneLength(int laneLength){
        this.laneLength = laneLength;
    }


    public void displayAlleyInfo() {
        super.displayAlleyInfo();
        System.out.println("Lanes: " + laneLength+ "  feet");
    }


    public void bookLane(int laneNumber){
        System.out.println("Booking: " + laneLength + "  in standard bowling alley" + name);
    }

}
    // override
    public CosmicBowlingAlley  extends BowlingAlley {
    private int specialEffect;

    public CosmicBowlingAlley() {
        super();
        specialEffect = 0;

    }

    public CosmicBowlingAlley(String name, int numOfLanes, int specialEffect){
        super(name, numOfLanes);
        this.specialEffect = specialEffect;

    }

    public CosmicBowlingAlley(CosmicBowlingAlley other) {
        super(other);
        this.specialEffect = other.specialEffect;
    }
    public int getSpecialEffect () {
        return specialEffect;
    }
    public void setSpecialEffect ( int specialEffect){
        this.specialEffect = specialEffect;
    }
    //override
    public void displayAlleyInfo () {
        super.displayAlleyInfo();
        System.out.println("Special Effects : " + specialEffect);
    }
    public void bookLane ( int laneNumber){
        System.out.println("Booking lane" + laneNumber + "in cosmic bowling alley " + name);
    }
}

class VIPBowlingAlley extends StandardBowlingAlley {
    private double vipMembershipFee;
    public VIPBowlingAlley(){
        super();
        this.vipMembershipFee = 0;
    }
    public VIPBowlingAlley(String name, int numOfLanes, double vipMembershipFee){
        super(name, numOfLanes, laneLength);
        this.vipMembershipFee = vipMembershipFee;

    }
    public VIPBowlingAlley(StandardBowlingAlley other) {
        super(other);
        this.vipMembershipFee = other.vipMembershipFee;

    }

    public double getVipMembershipFee () {
        return vipMembershipFee;

    }
    public void setVipMembershipFee (double vipMembershipFee){
        this.vipMembershipFee = vipMembershipFee;

    }
    
}







    public class Main {
    public static void main(String[] args) {

    }

}