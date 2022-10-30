package controler;

import java.util.HashMap;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class Commom {

    public static ModelAndView pageHome(Request req, Response res) {
        HashMap<String, Object> model = new HashMap<>();
        ChessMatch match = new ChessMatch();

        model.put("pieces", UI.getBoard(match.getPieces()));
        return new ModelAndView(model, "view/index.vm");
    }
}
