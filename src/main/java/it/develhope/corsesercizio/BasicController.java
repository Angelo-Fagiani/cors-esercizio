package it.develhope.corsesercizio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class BasicController {


    @GetMapping("/custom")
    public String msg(){
        return "Welcome Angelo!";
    }
}
