public class Dog {
    String breed;
    String size;
    int age;
    String colour;


    public Dog (String breed, String size, int age, String colour){
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.colour = colour;
    }

    public String eat(){
        return "the " + breed + "is eating biscuits.";
    }

    public String sleep(){
        return "the " + breed + "is asleep.";
    }

    public String sit(){
        return "the " + breed + "is sitting by the gate.";
    }

    public String run(){
        return "the " + breed + "is running.";
    }

    public String talk(){
        return "the " + breed + "is barking.";
    }

    public static void main(String[] args) {
        // Instantiate different objects from the Dog class 
        
        Dog dog1 = new Dog("Golden Retriever", "Large", 5, "Golden");
        Dog dog2 = new Dog("Beagle", "Medium", 3, "Tricolor");
        Dog dog3 = new Dog("Chihuahua", "Small", 2, "Fawn");
        
        System.out.println(dog1.eat());
        System.out.println(dog2.sleep());
        System.out.println(dog3.talk());

    }

}