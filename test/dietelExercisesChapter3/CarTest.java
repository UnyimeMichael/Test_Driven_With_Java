package dietelExercisesChapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarTest {
    Car car = new Car();
    Car car1 = new Car();
    @Test
    public void carAppTest(){

        car.setCarName("toyota");
        car.getCarName();
        assertEquals("toyota",car.getCarName());
    }

    @Test
    public void carYearTest(){
        car.yearOfCar("2023");
        car.getYearOfCar();
        assertEquals("2023", car.getYearOfCar());
    }

    @Test
    public void carPriceTest(){
        car.priceOfCar(10_000_000.00);
        car.getPriceOfCar();
        assertEquals(10_000_000, car.getPriceOfCar());
    }

    @Test
    public void car1AppTest(){
        car1.setCarName("benz");
        car1.getCarName();
        assertEquals("benz" ,car1.getCarName());
    }

    @Test
    public void car1YearTest(){
        car1.yearOfCar("2024");
        car1.getYearOfCar();
        assertEquals("2024", car1.getYearOfCar());

    }

    @Test
    public void car1PriceTest(){
        car1.priceOfCar(20_000_000);
        car1.getPriceOfCar();
        assertEquals(20_000_000 , car1.getPriceOfCar());
    }

    @Test
    public void carPriceOf5PercentDiscountTest(){
        car.setCarPrice(10_000_000);
        car.getCarDiscountedPrice();
        assertEquals(9_500_000, car.getCarDiscountedPrice());
    }

    @Test
    public void car1PriceOf7PercentDiscountTest(){
        car1.setCar1Price(20_000_000);
        car1.getCar1DiscountedPrice();
        assertEquals(18_600_000, car1.getCar1DiscountedPrice());
    }

    @Test
    public void setCarPriceToMinusAmount(){
        car1.priceOfCar(1_000);
        assertEquals(1_000,car1.getPriceOfCar() );

    }
    @Test
    public void purchaseCarWithNegativeAmountTest(){
        car1.priceOfCar(-1_000_000);
        assertEquals(0, car1.getPriceOfCar());

    }

//     @Test
//    public void testFotLoops(){
//        int expected = car.count();
//        assertEquals(expected, car.count());
//    }
//
//    @Test
//    public void addTwoNumbersTest(){
//        int num = 12;
//        int num1 = 22;
//        car.addTwoNumber(num1, num);
//        assertEquals(34, car.addTwoNumber(num1, num));
//    }



}
