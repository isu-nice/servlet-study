package hello.servlet.web.frontcontroller.v5;

import hello.servlet.web.frontcontroller.v4.ControllerV4;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "frontControllerServletV5", urlPatterns = "/front-controller/v5/*")
public class FrontControllerServletV5 extends HttpServlet {

    private final Map<String, Object> handleMappingMap = new HashMap<>();
    private final List<MyHandlerAdapter>

}
