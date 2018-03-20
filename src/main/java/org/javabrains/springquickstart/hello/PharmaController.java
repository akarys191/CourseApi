package org.javabrains.springquickstart.hello;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PharmaController {

    @RequestMapping("/hello")
    public void sayHelo(){

    }

}
