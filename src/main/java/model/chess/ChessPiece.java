package model.chess;

import model.boardgame.Board;
import model.boardgame.Piece;
import util.Color;

public class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public String getPiece() {
        return "<div class='col'> <div class='card h-100'> <div class='card-body'> " +
                "<img src='https://mdbcdn.b-cdn.net/img/new/standard/nature/182.webp' class='card-img' alt='Sunset Over the Sea' /></div></div></div>";
    }
}
