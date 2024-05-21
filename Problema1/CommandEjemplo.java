package Problema1;

public class CommandEjemplo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Command cortarCommand = new CortarCommand(editor);
        Command pegarCommand = new PegarCommand(editor);

        CommandInvoker invoker = new CommandInvoker();

        invoker.executeCommand(cortarCommand);
        System.out.println("Después del corte: " + editor.getTexto());

        invoker.undo();
        System.out.println("Después de deshacer el corte: " + editor.getTexto());

        invoker.executeCommand(pegarCommand);
        System.out.println("Después de pegar: " + editor.getTexto());

        invoker.undo();
        System.out.println("Después de deshacer pegar: " + editor.getTexto());

        invoker.redo();
        System.out.println("Después de rehacer pegar: " + editor.getTexto());
    }
}
