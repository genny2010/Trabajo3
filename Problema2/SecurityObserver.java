package Problema2;

public class SecurityObserver implements Observer {
    @Override
    public void update(String event) {
        if (event.equals("Alerta de Seguridad")) {
            System.out.println("Observador de seguridad: Manejo del evento de alerta de seguridad.");
        }
    }
}
