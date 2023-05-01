import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HumanTest {
    @Test
    public void humanTest(){
        Human human = new Human();
        human.setName("Godfrey");
        human.setAge(22);
        human.setWeight(55);
        human.setHeight(6);
        human.setColour("blue");
        human.setSize(10);
        assertEquals("Godfrey", human.getName());
        assertEquals(22, human.getAge());
        assertEquals(55, human.getWeight());
        assertEquals(6, human.getHeight());
        assertEquals("blue", human.getColour());
        assertEquals(10, human.getSize());
        System.out.println(human.getName());
    }
    @Test
    public void humanSpeakingTest(){
        Human human = new Human();
        human.isStatusSpeak(true);
        assertTrue(human.speak());
    }

    @Test
    public void humanSightTest(){
        Human human = new Human();
        human.isStatusSee(true);
        assertTrue(human.canSee());
    }

    @Test
    public void humanWalkTest(){
        Human human = new Human();
        human.canWalk(true);
        assertTrue(human.Walk());
    }
}
