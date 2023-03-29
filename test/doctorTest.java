import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class doctorTest {

    Doctor doctorD = new Doctor("godfrey");
    @Test
    public void doctorTest(){

      //  Doctor doctorD = new Doctor("godfrey");
        assertNotNull(doctorD);
    }

    @Test
    public void doctorPrescriptionTest(){
        String doctorName = doctorD.getDoctorName();
        assertNotEquals("godfrey ", doctorName);
    }
}
