package Problema1;

public class PegarCommand implements Command {
    private String backup;
    private Editor editor;

    public PegarCommand(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        backup = editor.getTexto();
        editor.pegar();
    }

    @Override
    public void unexecute() {
        editor.setTexto(backup);
    }
}