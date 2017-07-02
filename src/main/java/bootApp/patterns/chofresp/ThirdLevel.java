package bootApp.patterns.chofresp;

public class ThirdLevel extends QualificationLevel {
    @Override
    protected double getMinimumRange() {
        return basePower + 300;
    }

    @Override
    protected String getLevelName() {
        return "third";
    }
}
