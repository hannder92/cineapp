
package com.johann.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.johann.app.model.Notice;

@Controller
@RequestMapping(
        value = "/notices")
public class NoticesController {

    @GetMapping(
            value = "/create")
    public String create() {
        return "notices/formNotice";
    }

    @PostMapping(
            value = "/save")
    public String save(@RequestParam("title") String title, @RequestParam("status") String status,
            @RequestParam("detail") String detail) {

        Notice notice = new Notice();

        notice.setTitle(title);
        notice.setStatus(status);
        notice.setDetail(detail);

        // pendiente guardar noticia en BD

        System.out.println("Notice: " + notice);

        return "notices/formNotice";
    }

}
