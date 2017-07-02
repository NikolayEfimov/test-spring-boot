package bootApp.patterns.chofresp;

public abstract class QualificationLevel {

    private QualificationLevel nextLevel;

    protected abstract double getMinimumRange();

    protected abstract String getLevelName();

    protected int basePower = 100;

    public void processRequest(CustomerData customerData) {
        if (customerData.getBonus() + customerData.getScore() > this.getMinimumRange()) {
            System.out.println(customerData.getName() + " you have enough score for " + getLevelName() + " level");
            nextLevel.processRequest(customerData);
        } else {
            System.out.println(customerData.getName() + " you haven't enough score for " + getLevelName() + " level");
        }
    }

    public void setNextLevel(QualificationLevel nextLevel) {
        this.nextLevel = nextLevel;
    }
}
