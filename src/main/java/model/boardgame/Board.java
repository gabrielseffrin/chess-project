package model.boardgame;

public class Board {

    private int rows;
    private int collums;
    private Piece[][] pieces;

    public Board(int rows, int collums) {
        this.collums = collums;
        this.rows = rows;
        pieces = new Piece[rows][collums];
    }

    public void setCollums(int collums) {
        this.collums = collums;
    }

    public int getCollums() {
        return collums;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getRows() {
        return rows;
    }

    public Piece piece(int row, int collum) {
        return pieces[row][collum];
    }

    public Piece piece(Position position) {
        return pieces[position.getRow()][position.getCollum()];
    }
}