package controler;

import java.util.ArrayList;

import model.chess.ChessPiece;

public class UI {

    public static Object getBoard(ChessPiece[][] pieces) {
        ArrayList<String> board = new ArrayList<>();
        for (int i = 0; i < pieces.length; i++) {
            String aux = "<div class='card-group row g-1'>";

            for (int j = 0; j < pieces.length; j++) {
                aux += getPiece(pieces[i][j]);
            }
            aux += "</div>";
            board.add(aux);
            aux = "";
        }
        return board;
    }

    public static String getPiece(ChessPiece piece) {
        if (piece == null) {
            return "<div class='col'> <div class='card h-100'> <div class='card-body'></div></div></div>";
        }
        return piece.toString();
    }
}