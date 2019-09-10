package com.wedul.kubernetes;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * kubernetes
 *
 * @author wedul
 * @since 2019-09-11
 **/
@RestController
@RequestMapping("")
public class DemoController {

    @GetMapping("/test")
    public ResponseEntity test() {
        return ResponseEntity.ok("test");
    }
}
