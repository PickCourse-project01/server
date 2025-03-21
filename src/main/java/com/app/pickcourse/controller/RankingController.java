// 2025.02.24 조승찬
package com.app.pickcourse.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ranking/*")
@RequiredArgsConstructor
@Slf4j
public class RankingController {

    @GetMapping("/ranking")
    public void getRanking() {}

}
