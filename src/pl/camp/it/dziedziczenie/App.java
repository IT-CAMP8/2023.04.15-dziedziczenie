package pl.camp.it.dziedziczenie;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Puszek");
        cat.setRace("Mainkun");
        cat.setAge(10);

        System.out.println(cat.getName());
        System.out.println(cat.getRace());
        System.out.println(cat.getAge());

        Dog dog = new Dog();
        dog.setName("Reksio");
        dog.setRace("Kundel");
        dog.setAge(15);

        System.out.println(dog.getName());
        System.out.println(dog.getRace());
        System.out.println(dog.getAge());

        //cat.bark();
        cat.miaucz();
        dog.bark();
        dog.setColor("Jakis");

        System.out.println(dog.getColor());

        cat.walk();
        dog.walk();

        Snake snake = new Snake();
        snake.walk();

        cat.walk();
        cat.walk(10);

        Cat cat2 = new Cat();
        Pet pet = new Cat();
        //Cat cat3 = new Pet();

        cat2.walk();
        cat2.miaucz();

        if(pet instanceof Cat) {
            Cat c = (Cat) pet;
            c.miaucz();
        }

        Cat c1 = new Cat();
        Snake s2 = new Snake();
        Pet p1 = (Pet) s2;
        p1.walk();

        String string1 = "ABC";
        String string2 = new String("ABC");

        System.out.println(string1.equals(string2));

        Cat kot1 = new Cat();
        kot1.setName("Kotek");
        kot1.setRace("Dachowiec");
        kot1.setAge(10);

        Cat kot2 = new Cat();
        kot2.setName("Kotek puszek");
        kot2.setRace("Dachowiec");
        kot2.setAge(10);

        System.out.println(kot1.equals(kot2));

        System.out.println(kot1);
        System.out.println(kot2);
    }
}
