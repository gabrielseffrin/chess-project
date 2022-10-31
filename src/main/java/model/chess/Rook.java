package model.chess;

import model.boardgame.Board;
import util.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "<div class='col'> <div class='card h-100'> <div class='card-body' style='background-color: "
                + getColor() + ";'> rook" +
                "</div></div></div>";
    }
}
