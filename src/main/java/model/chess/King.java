package model.chess;

import model.boardgame.Board;
import util.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "<div class='col'> <div class='card h-100'> <div class='card-body'> king" +
                "</div></div></div>";
    }
}
