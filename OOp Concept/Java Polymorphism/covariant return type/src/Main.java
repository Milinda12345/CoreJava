import java.util.List;

public class Main {
    public static void main(String[] args) { // Corrected the main method signature
        UserOperation obj = new UserOperation();
        obj.fetchUser();
    }

    static class UserOperation {
        List<?> fetchUser() { // Used a wildcard to eliminate raw type usage
            System.out.println("user operation");
            return null;
        }
    }

    class AdvUserOperation extends UserOperation {
        @Override // Added @Override annotation
        List<?> fetchUser() { // Used a wildcard to eliminate raw type usage
            System.out.println("Adv User operations");
            return null;
        }
    }
}