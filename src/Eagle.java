public class Eagle extends Animal implements Speakable,Runable,Flyable {
    public Eagle(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public int flySpeed() {
        return 180;
    }

    @Override
    public int runSpeed() {
        return 1;
    }

    @Override
    public String speak() {
        return "hhhhhh";
    }

    @Override
    public String toString() {
        return "Eagle" + super.toString();
    }
}
