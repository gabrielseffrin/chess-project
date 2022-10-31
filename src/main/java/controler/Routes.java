package controler;

import static spark.Spark.*;
import spark.template.velocity.VelocityTemplateEngine;

public class Routes {

    public static void newRoutes() {

        VelocityTemplateEngine engine = new VelocityTemplateEngine();
        staticFiles.location("/public");

        /* index */
        get("/", Commom::pageHome, engine);

        /* play */
        post("/play", UI::readChessPosition);
    }
}
