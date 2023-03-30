package be.technifutur.builder;

public class StringLabyrintheBuider implements LabyrintheBuilder{

    private String result;
    private int line;

    public String build(){
        return result;
    }

    @Override
    public LabyrintheBuilder start() {
        line=0;
        result="";
        return this;
    }

    @Override
    public LabyrintheBuilder addPiece(int line, int column) {
        updateCurrentLine(line);
        result+=".";
        return this;
    }

    private void updateCurrentLine(int line) {
        if (line >this.line) {
            result += System.lineSeparator();
            this.line++;
        }
    }

    @Override
    public LabyrintheBuilder addMur(int line, int column) {
        updateCurrentLine(line);
        result+="m";
        return this;
    }

    @Override
    public LabyrintheBuilder addPorte(int line, int column) {
        updateCurrentLine(line);
        result+="p";
        return null;
    }
}
