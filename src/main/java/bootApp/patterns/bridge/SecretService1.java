package bootApp.patterns.bridge;

public class SecretService1 implements ApiInterface {

    @Override
    public int superAction(ApiObject apiObject) {
        System.out.println("secret1 super action");
        return apiObject.hashCode();
    }
}
