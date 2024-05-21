package Problema3;

public class  Component2 extends Component {
    public Component2(Mediator mediator) {
        super(mediator);
    }

    public void doB() {
        System.out.println("Componente2 hace B.");
        mediator.notify(this, "B");
    }

    public void reactOnA() {
        System.out.println("Componente2 reacciona sobre A.");
    }
}

