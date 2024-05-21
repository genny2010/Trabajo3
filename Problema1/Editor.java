package Problema1;

public class Editor {
    private String texto = "";

    public void cortar() {
        texto = ""; // Simulacion cortar
    }

    public void pegar() {
        texto = "Texto pegado"; // Simulacion pegar
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}