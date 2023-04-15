package pl.camp.it.dziedziczenie;

public class Cat extends Pet {

    public Cat() {
        //wywolany konstruktor rodzica
        //super();
        super("ASdf", "sadfas", 10);
        System.out.println("Konstruktor kota !!!");
    }

    public Cat(String name, String race, int age) {
        super(name, race, age);
        //???
        //??
    }

    public void miaucz() {
        this.setAge(5);
        this.ukrytaMetoda();
        System.out.println("miau miau !!");
    }

    public void walk(int distance) {
        super.walk();
        System.out.println("ide " + distance + " km");
    }

    @Override
    void ukrytaMetoda() {
        super.ukrytaMetoda();
        System.out.println("Cos dodatkowego !!");
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Cat)) {
            return false;
        }
        Cat c = (Cat) obj;
        return this.getAge() == c.getAge() &&
                this.getName().equals(c.getName()) &&
                this.getRace().equals(c.getRace());
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Name: ")
                .append(this.getName())
                .append(" Rasa: ")
                .append(this.getRace())
                .append(" Wiek: ")
                .append(this.getAge()).toString();
    }
}
