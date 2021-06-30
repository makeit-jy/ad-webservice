package com.incomad.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/board")
    public String board() {
        return "board";
    }

    @GetMapping("/read")
    public String read() {
        return "read";
    }

    @GetMapping("/write")
    public String write() {
        return "write";
    }



}
