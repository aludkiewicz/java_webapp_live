package com.hicollege.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/ui", method = RequestMethod.GET)
public class UiController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String getUi() {
        return "ui/ui";
    }
    
    @RequestMapping(value = "/album", method = RequestMethod.GET)
    public String getUiAlbum() {
        return "ui/ui_album";
    }

}
