package com.eric.ex1;

import org.springframework.beans.factory.annotation.Autowired;
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

}
