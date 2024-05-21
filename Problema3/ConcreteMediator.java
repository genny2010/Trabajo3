package Problema3;

public class ConcreteMediator implements Mediator {
    private Component1 component1;
    private Component2 component2;

    public void setComponent1(Component1 component1) {
        this.component1 = component1;
    }

    public void setComponent2(Component2 component2) {
        this.component2 = component2;
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender instanceof Component1 && event.equals("A")) {
            System.out.println("El mediador reacciona en A y desencadena la operación del Componente2:");
            component2.reactOnA();
        } else if (sender instanceof Component2 && event.equals("B")) {
            System.out.println("El mediador reacciona en B y desencadena la operación del Componente1:");
            component1.reactOnB();
        }
    }
}