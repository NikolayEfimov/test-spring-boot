package bootApp.quiz;

public class TypeCastQuiz {

    public static void main(String[] args) {
        resIsNull();
        resIsNpe();
    }

    private static void resIsNull() {
        Integer val = null;
        Object result;
        if (true) {
            result = val;
        } else {
            result = Double.valueOf(3.4);
        }
        System.out.println("result = " + result);
    }

    private static void resIsNpe() {
        try {
            Integer val = null;
            Object result;
            result = true ? val : Double.valueOf(3.4);
            System.out.println("result = " + result);
        } catch (Exception ex) {
            System.out.println("NPE was found");
        }
    }
}
