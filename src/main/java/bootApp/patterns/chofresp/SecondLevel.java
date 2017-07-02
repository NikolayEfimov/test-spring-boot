package bootApp.patterns.chofresp;

public class SecondLevel extends QualificationLevel {


    @Override
    protected String getLevelName() {
        return "second";
    }

    @Override
    protected double getMinimumRange() {
        return basePower + 200;
    }
}
