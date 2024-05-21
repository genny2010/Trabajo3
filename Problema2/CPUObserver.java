package Problema2;

public class CPUObserver implements Observer {
    @Override
    public void update(String event) {
        if (event.equals("CPU Alta")) {
            System.out.println("Observador de CPU: Manejo del evento CPU Alta.");
        }
    }
}