public class WhiteBear extends Animal implements Speakable, Swimable, Runable{
    public WhiteBear(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public int runSpeed() {
        return 60;
    }

    @Override
    public String speak() {
        return "Rrrrrrr";
    }

    @Override
    public int swimSpeed() {
        return 40;
    }
}
