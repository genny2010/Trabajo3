package Problema3;

public class Component1 extends Component {
    public Component1(Mediator mediator) {
        super(mediator);
    }

    public void doA() {
        System.out.println("Componente1 hace A.");
        mediator.notify(this, "A");
    }

    public void reactOnB() {
        System.out.println("Componente2 reacciona sobre B.");
    }
}