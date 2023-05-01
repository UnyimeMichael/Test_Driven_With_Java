public class Human {
    private String name;
    private int age;
    private int weight;
    private int height;
    private String colour;
    private int size;
    private boolean statusSpeak;
    private boolean statusSee;
    private boolean statusWalk;

    public void setName(String theName) {
        this.name = theName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;

    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setSize(int size) {
        this.size = size;

    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public String getColour() {
        return colour;
    }

    public int getSize() {
        return size;
    }

    public void isStatusSpeak(boolean status) {
        this.statusSpeak = status;
    }

    public boolean speak() {
        return statusSpeak;
    }

    public void isStatusSee(boolean see) {
        this.statusSee = see;

    }

    public boolean canSee() {
        return statusSee;
    }

    public void canWalk(boolean walk) {
        this.statusWalk = walk;
    }

    public boolean Walk() {
        return statusWalk;
    }
}
