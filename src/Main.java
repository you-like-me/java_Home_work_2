public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cat("Dimka",4,"Oleg"))
                .addAnimal(new Dog("Tuzik",4,"Petya"))
                .addAnimal(new Duck("Donald",2,"Ivan"))
                .addAnimal(new Eagle("Trut",2,"Sasha"))
                .addAnimal(new Peliсan("Vovan",2,"Vasya"))
                .addAnimal(new WhiteBear("Potapich",4,"Valeriy"));
        System.out.println(zoo.toString());
        System.out.println("------Звуки животных------");
        System.out.println(zoo.talk());
        System.out.println("------Скорость бега------");
        for (Runable i: zoo.getRunable()) {
            System.out.println(i.toString()+" " + i.runSpeed()+ "км/ч");
        }
        System.out.println("---------------");
        System.out.println("Самая большая скорость животного: " + zoo.getChampionSpeed());
        System.out.println("------Скорости полета------");
        for (Flyable i: zoo.getFlyable())
        {
            System.out.println(i.toString() +" "+ i.flySpeed()+ "км/ч");
        }
        System.out.println("---------------");
        System.out.println("------Скорости плавания------");
        for (Swimable i: zoo.getSwimable())
        {
            System.out.println(i.toString()+" "+i.swimSpeed()+ "км/ч");
        }
        SaveManagerAnimals saveManagerAnimals = new SaveManagerAnimals();
        saveManagerAnimals.save(zoo.getAnimals());

    }
}