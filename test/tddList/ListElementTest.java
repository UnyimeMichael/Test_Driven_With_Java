package tddList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListElementTest {
//    given
    ListElement list = new ListElement();
    @Test
    public void MyListExitTest(){
        assertNotNull(list);
    }
    @Test
    public void MyListIsEmptyTest(){
//        when
        list.isEmpty();
        assertTrue(list.isEmpty);
    }
    @Test
    public void addToMyListTest(){
        list.isEmpty();
        list.addElement[0] = "Ade";
        assertFalse(list.isEmpty());
    }


}
