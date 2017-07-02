package bootApp.patterns.chofresp;

public class FirstLevel extends QualificationLevel {


    @Override
    protected String getLevelName() {
        return "first";
    }

    @Override
    protected double getMinimumRange() {
        return basePower + 100;
    }
}
