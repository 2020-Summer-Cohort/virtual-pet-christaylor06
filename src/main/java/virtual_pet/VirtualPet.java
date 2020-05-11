package virtual_pet;

public class VirtualPet {

    private double puppyIQ;
    private int happyPuppy;
    private int cleanBubbles;

    public double getPuppyIQ() {
        return puppyIQ;
    }

    public int getHappyPuppy() {
        return happyPuppy;
    }

    public int getCleanBubbles() {
        return cleanBubbles;
    }

    public VirtualPet(double puppyIQ, int happyPuppy, int cleanBubbles) {
        this.puppyIQ = puppyIQ;
        this.happyPuppy = happyPuppy;
        this.cleanBubbles = cleanBubbles;
    }

    public void sitBubbles(double sitBubbles) {

        puppyIQ += sitBubbles;
    }
    public void batheBubbles(int batheBubbles){

        if (cleanBubbles <= 0) {
            cleanBubbles = batheBubbles;
        } else {
           cleanBubbles -= batheBubbles;
        }

    }

    public void rollBubbles(double rollBubbles) {
        puppyIQ +=  rollBubbles+1;
    }

    public void goodBubbles(int goodBubbles) {
        happyPuppy += goodBubbles;
    }
}





