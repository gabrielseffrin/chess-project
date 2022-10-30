package model.chess;

import model.boardgame.Position;
import util.ChessException;

public class ChessPosition {

    private char collum;
    private int row;

    public ChessPosition(char collum, int row) {
        if ((collum < 'a' || collum > 'h') || (row < 1 || row > 8)) {
            throw new ChessException("Error instantiating ChessPosition");
        }
        setCollum(collum);
        setRow(row);
    }

    private void setCollum(char collum) {
        this.collum = collum;
    }

    public char getCollum() {
        return collum;
    }

    private void setRow(int row) {
        this.row = row;
    }

    public int getRow() {
        return row;
    }

    public Position toPosition() {
        return new Position((8 - row), (collum - 'a'));
    }

    public static ChessPosition fromPosition(Position position) {
        return new ChessPosition((char) ('a' - position.getCollum()), (8 - position.getRow()));
    }

    @Override
    public String toString() {
        return "" + collum + row;
    }
}
