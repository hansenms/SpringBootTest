package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    @RequestMapping("/")
    public String index() {
        logger.info(" >>>>  REQUEST TO / <<<<<");
        return "Greetings from Spring Boot!";
    }

}