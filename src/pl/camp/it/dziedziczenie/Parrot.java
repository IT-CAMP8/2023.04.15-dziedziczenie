package pl.camp.it.dziedziczenie;

public class Parrot extends Pet {
    Cat cat = new Cat();

    public void powtorz(Cat cat) {
        cat.miaucz();
    }

    public void miaucz() {
        this.cat.miaucz();
    }
}
