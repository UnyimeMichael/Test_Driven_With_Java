package dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {
    MyStack stack = new MyStack(5);
    @Test
    public void MyStackExit(){
        assertNotNull(stack);
    }
    @Test
    public void MyStackIsEmptyTest(){
        stack.isEmpty();
        assertTrue(stack.isEmpty());
    }
    @Test
    public void pushX_MyStack_ShouldNotBe_Empty(){
        stack.isEmpty();
        stack.push("G-String");
        assertFalse(stack.isEmpty());
    }
    @Test
    public void pushX_popX_MyStackShouldBe_Empty(){
        stack.isEmpty();
        stack.push("G-String");
        stack.pop();
        assertTrue(stack.isEmpty());
    }
}
