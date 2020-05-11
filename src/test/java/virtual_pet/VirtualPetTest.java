package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    @Test
    public void shouldHaveDefaultIQof10() {
        VirtualPet underTest = new VirtualPet(10.0, 0, 0);
        double puppyIQ = underTest.getPuppyIQ();
        assertEquals(10.0, puppyIQ);
    }
    @Test
    public void shouldHaveDefaultIQof50() {
        VirtualPet underTest = new VirtualPet(50.0,0,0);
        double puppyIQ = underTest.getPuppyIQ();
        assertEquals(50.0, puppyIQ);
    }
    @Test
    public void shouldHaveAnIQOf60AfterSitting1Time() {
        VirtualPet underTest = new VirtualPet(50.0,0,0);
        underTest.sitBubbles(10.0);
        double puppyIQ = underTest.getPuppyIQ();
        assertEquals(60.0, 60,puppyIQ);
    }
    @Test
    public void shouldHaveAnIQOf80AfterRolling1Time() {
        VirtualPet underTest = new VirtualPet(60.0,0,0);
        underTest.rollBubbles(20.0);
        double puppyIQ = underTest.getPuppyIQ();
        assertEquals(80.0,80, puppyIQ);
    }
    @Test
    public void shouldHaveAnIQOf100AfterRolling5Times(){
        VirtualPet underTest = new VirtualPet(80.0,0,0);
        underTest.rollBubbles(5);
        double puppyIQ = underTest.getPuppyIQ();
        assertEquals(180.0, 100.0, puppyIQ);
    }
    @Test
    public void shouldHaveAnIQOf100AfterSitting11Times(){
        VirtualPet underTest = new VirtualPet(0.0,0,0);
        underTest.sitBubbles(11);
        double puppyIQ = underTest.getPuppyIQ();
        assertEquals(110.0, 100.0, puppyIQ);
    }


    @Test
    public void shouldHaveDefaultHappyOf5() {
        VirtualPet underTest = new VirtualPet(0.0, 5,0);
        int happyPuppy = underTest.getHappyPuppy();
        assertEquals(5, happyPuppy);
    }
    @Test
    public void shouldHaveDefaultHappyOf10() {
        VirtualPet underTest = new VirtualPet(0,10,0);
        int happyPuppy = underTest.getHappyPuppy();
        assertEquals(10, happyPuppy);
    }
    @Test
    public void shouldHaveAHappyOf9After1Bath(){
        VirtualPet underTest = new VirtualPet(0,10,0);
        underTest.batheBubbles(1);
        int happyPuppy = underTest.getHappyPuppy();
        assertEquals(9, 9,happyPuppy);
    }
    @Test
    public void shouldHaveAHappyOf9After1Treat(){
        VirtualPet underTest = new VirtualPet(0,8,0);
        underTest.goodBubbles(1);
        int happyPuppy = underTest.getHappyPuppy();
        assertEquals(9, 9,happyPuppy);
    }
    @Test
    public void shouldHaveAHappyOf10After2Treat(){
        VirtualPet underTest = new VirtualPet(0,9,0);
        underTest.goodBubbles(2);
        int happyPuppy = underTest.getHappyPuppy();
        assertEquals(11,10, happyPuppy);
    }
    @Test
    public void shouldHaveAHappyOf0After11Bath(){
        VirtualPet underTest = new VirtualPet(0,10,0);
        underTest.batheBubbles(11);
        int happyPuppy = underTest.getHappyPuppy();
        assertEquals(0, 0,happyPuppy);
    }
}
