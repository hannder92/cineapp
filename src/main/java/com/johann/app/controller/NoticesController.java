
package com.johann.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.johann.app.model.Notice;
import com.johann.app.service.INoticeService;

@Controller
@RequestMapping(
        value = "/notices")
public class NoticesController {

    @Autowired
    private INoticeService noticeService;

    @GetMapping(
            value = "/create")
    public String create() {
        return "notices/formNotice";
    }

    @PostMapping(
            value = "/save")
    public String save(Notice notice) {
        // pendiente guardar noticia en BD
        System.out.println("Notice: " + notice);
        return "notices/formNotice";
    }

}
