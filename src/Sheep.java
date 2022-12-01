public class Sheep  extends Animal{
    public Sheep(int weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    public Sheep() {
    }

    @Override
    public String toString() {
        return "Sheep{}"+super.toString();
    }
}
