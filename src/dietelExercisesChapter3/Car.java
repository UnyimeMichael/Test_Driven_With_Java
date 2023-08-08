package dietelExercisesChapter3;

public class Car {
    private String name;
    private String carYear;
    private double carPrice;
    private double discountedCarPrice;

    public void setCarName(String carName) {
        name = carName;
    }

    public String getCarName() {
        return name;
    }

    public void yearOfCar(String carYear) {
        this.carYear = carYear;
    }

    public String getYearOfCar() {
        return carYear;
    }


    public void priceOfCar(double carPrice) {
        if (carPrice < 0 ){
            carPrice = 0;
            System.out.println(" You be thief ");
        }
        this.carPrice = carPrice;
    }

    public double getPriceOfCar() {
        return carPrice;
    }

//    public void setCar1Name(String car1Name) {
//        name = car1Name;
//    }
//
//    public String getCar1Name() {
//        return name;
//    }
//
//    public void yearOfCar1(String carYear) {
//        this.carYear = carYear;
//    }
//
//    public String getYearOfCar1() {
//        return carYear;
//    }
//
//    public void priceOfCar1(double carPrice) {
//        this.carPrice = carPrice;
//    }
//
//    public double getCar1Price() {
//        return carPrice;
//    }

    public void setCarPrice(double carPrice) {
        double discount5Percent = (5 * carPrice)/100;
        this.discountedCarPrice = carPrice - discount5Percent;
    }

    public double getCarDiscountedPrice() {
        return discountedCarPrice;
    }

    public void setCar1Price(double carPrice) {
        double discountOf7Percent = (7 * carPrice)/100;
        this.discountedCarPrice = carPrice - discountOf7Percent;
    }

    public double getCar1DiscountedPrice() {
        return discountedCarPrice;
    }

}
