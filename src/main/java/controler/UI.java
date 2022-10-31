package controler;

import java.util.ArrayList;

import spark.Request;

import model.chess.ChessPiece;
import spark.Response;

public class UI {

    public static Object readChessPosition(Request req, Response res) {

        return "";
    }

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
        // a classe ChessPiece não contém o método toString(), mas o objeto recebido
        // como parâmetro herda
        // a classe ChessPiece, e este objeto ai sim possuí o método toString()
        return piece.toString();
    }
}