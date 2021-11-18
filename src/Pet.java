public class Pet {
    
    // initiliaze instance variables
    private String name;
    private int age;
    private String location;

    // empty constuctor
    public Pet() {

    }
    // constructor with all attributes
    public Pet(String name, int age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
    }

    // access methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    // Set methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    //main method
    public static void main(String[] args) throws Exception {
        //instatiating and creating new Pet object
        Pet cat = new Pet("Henry", 2, "home");
        System.out.println(cat.name);

        Pet fish = new Pet();
        fish.setName("Oscar");
        fish.setAge(3);
        fish.setLocation("water");
        System.out.println("My pet fish named " + fish.getName() + ", is " + fish.getAge() + " years old and lives in " + fish.getLocation() + "!");
    }

}