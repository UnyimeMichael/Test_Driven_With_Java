package dietelExercisesChapter3;

public class PetrolPurchase {
    private String location;
    private String petrolType;
    private int petrolQuantity;
    private double price;
    private double percentageDiscountAmount;
    private double netPurchaseAmount;

//    public PetrolPurchase(String location, String petrolType, int petrolQuantity, double price, double percentageDiscountAmount, double netPurchaseAmount){
//        this.location = location;
//        this.petrolType = petrolType;
//        this.petrolQuantity = petrolQuantity;
//        this.price = price;
//        this.percentageDiscountAmount = percentageDiscountAmount;
//        this.netPurchaseAmount = netPurchaseAmount;
//
//    }
    public void setLocation(String address){
        location = address;
    }
    public String getLocation(){
        return location;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public int getPetrolQuantity() {
        return petrolQuantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPercentageDiscount() {
        return percentageDiscountAmount;
    }

    public void setPercentageDiscountAmount(double discountPercentage) {
        percentageDiscountAmount = (discountPercentage * price) / 100;
    }

    public void setPetrolQuantity(int petrolQuantity) {
        this.petrolQuantity = petrolQuantity;
    }
    public double getPurchaseAmount(double discountAmount) {
        netPurchaseAmount = (petrolQuantity * price) - discountAmount;
        return netPurchaseAmount;

    }

    public static void main(String[] args) {
        PetrolPurchase petrolPurchase = new PetrolPurchase();
        petrolPurchase.setPrice(1000);
        System.out.println(petrolPurchase.getPurchaseAmount(5));
       // System.out.println(petrolPurchase.netPurchaseAmount());
    }

}
