package Problema2;

public class ObserverExample {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer cpuObserver = new CPUObserver();
        Observer securityObserver = new SecurityObserver();

        subject.attach(cpuObserver);
        subject.attach(securityObserver);

        subject.setEvent("CPU Alta");
        subject.setEvent("Alerta de Seguridad");
    }
}