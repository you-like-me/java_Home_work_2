public class Cat extends Animal implements Speakable,Runable {

    public Cat(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public String speak() {
        return "Myau";
    }

    @Override
    public int runSpeed() {
        return 50;
    }

    @Override
    public String toString() {
        return "Cat" + super.toString();
    }
}