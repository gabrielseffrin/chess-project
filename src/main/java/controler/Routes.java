package controler;

import static spark.Spark.*;
import spark.template.velocity.VelocityTemplateEngine;

public class Routes {

    public static void newRoutes() {

        VelocityTemplateEngine engine = new VelocityTemplateEngine();
        staticFiles.location("/public");

        get("/", Commom::pageHome, engine);
    }
}
