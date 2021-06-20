package app.nsoz.mnt.bgates.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description Class
 *
 * @author khanh
 * @version v1
 * @date 6/20/2021
 */
@RestController
@RequestMapping("/hi")
public class Healthcheck {

    @GetMapping
    private String welcome(){
        return "Hi, :)";
    }

    @GetMapping("/hint")
    private String noted() {
        // todo display file on web
        return null;
    }
}
