public class Peliсan extends Animal implements Flyable, Swimable, Speakable, Runable{
    public Peliсan(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public int flySpeed() {
        return 125;
    }

    @Override
    public int runSpeed() {
        return 2;
    }

    @Override
    public String speak() {
        return "CrCrCr";
    }

    @Override
    public int swimSpeed() {
        return 26;
    }
}
