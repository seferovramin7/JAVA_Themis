package Lesson_13;

// Target Interface: Defines the behavior the client expects.
interface AmericanSocket {
    void providePower();
}

// Adaptee: Existing class with an incompatible interface.
class EuropeanPlug {
    public void connectToEuropeanSocket() {
        System.out.println("Connected to European socket and charging...");
    }
}

// Adapter: Adapts the European plug to the American socket.
class SocketAdapter implements AmericanSocket {
    private EuropeanPlug europeanPlug;

    // Constructor to accept a European plug
    public SocketAdapter(EuropeanPlug europeanPlug) {
        this.europeanPlug = europeanPlug;
    }

    @Override
    public void providePower() {
        // Adapts the behavior
        europeanPlug.connectToEuropeanSocket();
    }
}

// Client: Works with the Target Interface (AmericanSocket).
public class AdapterPatternRealLife {
    public static void main(String[] args) {
        // European plug
        EuropeanPlug europeanPlug = new EuropeanPlug();

        // Adapter to connect the European plug to an American socket
        AmericanSocket adapter = new SocketAdapter(europeanPlug);

        // Using the adapter to provide power
        adapter.providePower();
    }
}

