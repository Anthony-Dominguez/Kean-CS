class BowlingAlley {
    protected String name;
    protected int numOfLanes;
    protected static int totalAlleys;
    private static BowlingAlley[] bowlingAlleys;


    public BowlingAlley() {
        this.name = "unknown";
        this.numOfLanes = 0;
        totalAlleys++;
    }

    public BowlingAlley(String name, int numOfLanes) {
        this.name = name;
        this.numOfLanes = numOfLanes;
        totalAlleys++;
    }

    public BowlingAlley(BowlingAlley other) {
        this.name = other.name;
        this.numOfLanes = other.numOfLanes;
        totalAlleys++;
    }

    public static int getTotalAlleys() {
        return totalAlleys;
    }

    public static BowlingAlley[] getAlleyArray() {
        return bowlingAlleys;
    }

    public static void setAlleyArray(BowlingAlley[] bowlingAlleys) {
        BowlingAlley.bowlingAlleys = bowlingAlleys;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfLanes() {
        return numOfLanes;
    }

    public void setNumOfLanes(int numOfLanes) {
        this.numOfLanes = numOfLanes;
    }

    public void displayAlleyInfo() {
        System.out.println("Alley Name: " + name);
        System.out.println("Number of Lanes: " + numOfLanes);
    }

    public void bookLane(int laneNumber) {
        System.out.println("Booking lane " + laneNumber + " in " + name);
    }
}

class StandardBowlingAlley extends BowlingAlley {
    private int laneLength;

    public StandardBowlingAlley() {
        super();
        this.laneLength = 0;
    }

    public StandardBowlingAlley(String name, int numOfLanes, int laneLength) {
        super(name, numOfLanes);
        this.laneLength = laneLength;
    }

    public StandardBowlingAlley(StandardBowlingAlley other) {
        super(other);
        this.laneLength = other.laneLength;
    }

    public int getLaneLength() {
        return laneLength;
    }

    public void setLaneLength(int laneLength) {
        this.laneLength = laneLength;
    }

    @Override
    public void displayAlleyInfo() {
        super.displayAlleyInfo();
        System.out.println("Lane Length: " + laneLength + " feet");
    }

    @Override
    public void bookLane(int laneNumber) {
        System.out.println("Booking lane " + laneNumber + " in standard bowling alley " + name);
    }
}

class CosmicBowlingAlley extends BowlingAlley {
    private int specialEffect;

    public CosmicBowlingAlley() {
        super();
        this.specialEffect = 0;
    }

    public CosmicBowlingAlley(String name, int numOfLanes, int specialEffect) {
        super(name, numOfLanes);
        this.specialEffect = specialEffect;
    }

    public CosmicBowlingAlley(CosmicBowlingAlley other) {
        super(other);
        this.specialEffect = other.specialEffect;
    }

    public int getSpecialEffect() {
        return specialEffect;
    }

    public void setSpecialEffect(int specialEffect) {
        this.specialEffect = specialEffect;
    }

    @Override
    public void displayAlleyInfo() {
        super.displayAlleyInfo();
        System.out.println("Special Effects: " + specialEffect);
    }

    @Override
    public void bookLane(int laneNumber) {
        System.out.println("Booking lane " + laneNumber + " in cosmic bowling alley " + name);
    }
}

class VIPBowlingAlley extends StandardBowlingAlley {
    private double vipMembershipFee;

    public VIPBowlingAlley() {
        super();
        this.vipMembershipFee = 0;
    }

    public VIPBowlingAlley(String name, int numOfLanes, int laneLength, double vipMembershipFee) {
        super(name, numOfLanes, laneLength);
        this.vipMembershipFee = vipMembershipFee;
    }

    public VIPBowlingAlley(VIPBowlingAlley other) {
        super(other);
        this.vipMembershipFee = other.vipMembershipFee;
    }

    public double getVipMembershipFee() {
        return vipMembershipFee;
    }

    public void setVipMembershipFee(double vipMembershipFee) {
        this.vipMembershipFee = vipMembershipFee;
    }

    //Override
    public void displayAlleyInfo() {
        super.displayAlleyInfo();
        System.out.println("VIP Membership Fee: $" + vipMembershipFee);
    }

    //Override
    public void bookLane(int laneNumber) {
        System.out.println("Booking VIP lane " + laneNumber + " in VIP bowling alley " + name);
    }
}


public class BowlingAlleyTest {
    public static void main(String[] args) {
        BowlingAlley[] alleys = new BowlingAlley[3];

        alleys[0] = new StandardBowlingAlley("Bowling Alley", 10, 60);
        alleys[1] = new CosmicBowlingAlley("Bowling Alley", 8, 20);
        alleys[2] = new VIPBowlingAlley("Bowling Alley", 12, 50,50.0);

        for (BowlingAlley alley : alleys){
            alley.displayAlleyInfo();
            alley.bookLane(1);;
            System.out.println("-----------------");
        }

    }

}