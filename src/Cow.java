public class  Cow extends Animal {
    public Cow(int weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    public Cow() {
    }

    @Override
    public String toString() {
        return "Cow{}"+super.toString();
    }
}

