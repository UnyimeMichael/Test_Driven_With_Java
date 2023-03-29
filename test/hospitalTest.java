import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class hospitalTest {

//    private Hospital myHospital = new Hospital("Godfrey");
//    @Test
//    public void testThatHospitalExist(){
//
//        Hospital myHospital = new Hospital("Godfrey");
//        assertNotNull(myHospital);
//
//    }
//    @Test
//    public void HospitalNameFound(){
//       String hospitalName = myHospital.getHospitalName();
//
//       assertEquals( "Godfrey", hospitalName);
//    }
//    @Test
//    public void changeHospitalName(){
//
//        myHospital.changeHospitalName("mike");
//        assertEquals("mike", myHospital.getHospitalName());
//    }
//    @Test
//    public void yearHospitalWasCreatedTest(){
//        myHospital.yearCreated("1990");
//        String hospitalCreated = myHospital.getYearCreated();
//        assertEquals("1990", hospitalCreated);
//    }
//
//    @Test
//    public void numberOfHospitalRoomTest(){
//        myHospital.numberOfRoom("1");
//        String numberOfHospitalRoom = myHospital.getNumberOfRoom();
//        assertEquals("1", numberOfHospitalRoom);
//    }



    @Test
    public void hospitalExistTest(){
        Hospital myHospital = new Hospital();
        assertNotNull(myHospital);
    }

    @Test
    public void hospitalNameTest(){
        Hospital myHospital = new Hospital();
        myHospital.setHospitalName("godfrey");
        String hospitalName = myHospital.getHospitalName();
        assertEquals("godfrey", hospitalName);
    }

    @Test
    public void hospitalNameChangeTest(){
        Hospital myHospital = new Hospital();
        myHospital.changeHospitalName("mike");
        String hospitalName = myHospital.getHospitalName();
        assertEquals("mike", hospitalName);
    }
}
