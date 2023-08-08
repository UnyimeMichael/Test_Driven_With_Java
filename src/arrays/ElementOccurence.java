package arrays;

public class ElementOccurence {


    public static void main(String[] args) {
        ElementOccurence elementOccurence = new ElementOccurence();
        int [] arrays = {2, 4,5,3,7,8};
        int element = 6;
        System.out.println(elementOccurence.findNumber(arrays, element));
    }

    public String findNumber(int [] arrays, int element) {
        String result ="";
        for (int num : arrays) {
            if (num == element) {
                result = "The number was found";
                break;
            }
            else {
                result = "The element was not found";
            }
        }
            return  result;
    }

}
