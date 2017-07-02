package bootApp.patterns.bridge;

public class SecretService2 implements ApiInterface {
    @Override
    public int superAction(ApiObject apiObject) {
        System.out.println("secret2 super action");
        return Math.round(apiObject.hashCode());
    }
}
