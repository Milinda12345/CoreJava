import java.nio.DoubleBuffer;

public class DoubleBufferExample {
    public static void main(String[] args) {
        DoubleBuffer buffer = DoubleBuffer.allocate(10);

        buffer.put(new double[] {1.1, 2.2, 3.3, 4.4, 5.5}); // Add some elements
        buffer.flip(); // Prepare the buffer for reading

        System.out.println("Before setting new limit: ");
        System.out.println("Position: " + buffer.position() + ", Limit: " + buffer.limit());

        buffer.limit(3); // Set a new limit
        System.out.println("After setting new limit: ");
        System.out.println("Position: " + buffer.position() + ", Limit: " + buffer.limit());

        while (buffer.hasRemaining()) {
            System.out.println("Element: " + buffer.get());
        }
    }
}
