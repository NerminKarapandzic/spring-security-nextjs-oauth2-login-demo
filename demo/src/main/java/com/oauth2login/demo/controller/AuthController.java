package com.oauth2login.demo.controller;

import com.oauth2login.demo.AppUser;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

  @GetMapping("/me")
  public ResponseEntity<AppUser> google() {
    AppUser user = (AppUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    return ResponseEntity.ok(user);
  }

}
