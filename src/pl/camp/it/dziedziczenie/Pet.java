package pl.camp.it.dziedziczenie;

public class Pet {
    private String name;
    private String race;
    private int age;

    public Pet() {
        System.out.println("Konstruktor zwierzecia !!!");
    }

    public Pet(String name, String race, int age) {
        //kostruktor klasy Object
        this.name = name;
        this.race = race;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void ukrytaMetoda() {
        System.out.println("aslkdhjgflakjsghd");
    }

    public void walk() {
        System.out.println("Ide na czterech lapach !!");
    }
}
