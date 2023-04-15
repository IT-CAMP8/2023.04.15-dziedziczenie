package pl.camp.it.dziedziczenie;

public class Dog extends Pet {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void bark() {
        System.out.println("Hau hau !!");
    }
}
