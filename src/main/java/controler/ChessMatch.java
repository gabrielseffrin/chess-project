package controler;

import model.boardgame.Board;
import model.chess.ChessPiece;
import model.chess.ChessPosition;
import model.chess.King;
import model.chess.Rook;
import util.Color;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getCollums()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getCollums(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }

    private void placeNewPiece(char collum, int row, ChessPiece piece) {
        board.placePiece(piece, new ChessPosition(collum, row).toPosition());
    }

    private void initialSetup() {
        placeNewPiece('b', 6, new Rook(board, Color.WHITE));
        placeNewPiece('b', 7, new Rook(board, Color.BLACK));
    }
}