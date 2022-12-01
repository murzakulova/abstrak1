import java.util.Arrays;

public class Farm {

        private String ownerName;
        private String adress;
        private Cow[] cows;
        private Horse[] horses;
        private Sheep[] sheeps;

    public Farm(String ownerName, String adress, Cow[] cows, Horse[] horses, Sheep[] sheeps) {
        this.ownerName = ownerName;
        this.adress = adress;
        this.cows = cows;
        this.horses = horses;
        this.sheeps = sheeps;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "\nownerName='" + ownerName + '\'' +
                "\n adress='" + adress + '\'' +
                "\n cows=" + Arrays.toString(cows) +
                "\n horses=" + Arrays.toString(horses) +
                "\n sheeps=" + Arrays.toString(sheeps) +
                '}';
    }
}


