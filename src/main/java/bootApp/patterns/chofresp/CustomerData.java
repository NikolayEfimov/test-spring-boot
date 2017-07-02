package bootApp.patterns.chofresp;

public class CustomerData {

    private String name;
    private double score;
    private double bonus;

    public CustomerData(String name, double score, double bonus) {
        this.name = name;
        this.score = score;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
