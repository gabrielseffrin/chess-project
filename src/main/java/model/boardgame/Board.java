package model.boardgame;

import util.BoardException;

public class Board {

    private int rows;
    private int collums;
    private Piece[][] pieces;

    public Board(int rows, int collums) {
        if (rows < 1 || collums < 1) {
            throw new BoardException("Error creating board: there must be at least 1 row and 1 collum");
        }
        setCollums(collums);
        setRows(rows);
        pieces = new Piece[rows][collums];
    }

    private void setCollums(int collums) {
        this.collums = collums;
    }

    public int getCollums() {
        return collums;
    }

    private void setRows(int rows) {
        this.rows = rows;
    }

    public int getRows() {
        return rows;
    }

    public Piece piece(int row, int collum) {
        if (!positionExists(row, collum))
            throw new BoardException("Position not on the board");
        return pieces[row][collum];
    }

    public Piece piece(Position position) {
        if (!positionExists(position))
            throw new BoardException("Position not on the board");
        return pieces[position.getRow()][position.getCollum()];
    }

    public void placePiece(Piece piece, Position position) {
        if (thereIsAPiece(position)) {
            throw new BoardException("There is alredy a piece on position" + position);
        }
        pieces[position.getRow()][position.getCollum()] = piece;
        piece.position = position;
    }

    private boolean positionExists(int row, int collum) {
        return ((row >= 0 && row < rows) && (collum >= 0 && collum < collums));
    }

    public boolean positionExists(Position position) {
        return positionExists(position.getRow(), position.getCollum());
    }

    public boolean thereIsAPiece(Position position) {
        if (!positionExists(position))
            throw new BoardException("Position not on the board");
        return piece(position) != null;
    }

    public Piece removePiece(Position position) {
        if (!positionExists(position)) {
            throw new BoardException("Position not on the board");
        }

        if (piece(position) == null)
            return null;

        Piece aux = piece(position);
        aux.position = null;
        pieces[position.getRow()][position.getCollum()] = null;
        return aux;
    }
}