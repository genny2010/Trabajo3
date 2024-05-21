package Problema1;

public class CortarCommand implements Command {
 private String backup;
 private Editor editor;

 public CortarCommand(Editor editor) {
     this.editor = editor;
 }

 @Override
 public void execute() {
     backup = editor.getTexto();
     editor.cortar();
 }

 @Override
 public void unexecute() {
     editor.setTexto(backup);
 }
}