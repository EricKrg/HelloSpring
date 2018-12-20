package com.eric.ex1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.NotificationServices;

@RestController
public class ExController {

    @Autowired // inject notify services
    private NotificationServices notificationServices;

    @RequestMapping("/")
    public String greeter(){
        return this.notificationServices.send("Moin Moin Spring");
    }

    @RequestMapping("/gohome")
    public String bye(){
        return "bye bey";
    }

    @RequestMapping("/notify")
    public String notifyServ() { return this.notificationServices.toString(); }

    //app.properties
    @Value("${controller.msg}")
    private String controllerMsg;
    @RequestMapping("/prop")
    public String appProps(){ return  controllerMsg; }
    // from yaml
    @Value("${messages.greet}")
    private String greet;
    @Value("${messages.bye}")
    private  String bye;
    @RequestMapping("/yaml")
    public String appYamTalk(){ return greet + " and " + bye; }

    //random values from props.
    @Value("${my.secret}")
    private  String secret;
    @RequestMapping("/secret")
    public String randSecret(){ return this.secret; }


}
