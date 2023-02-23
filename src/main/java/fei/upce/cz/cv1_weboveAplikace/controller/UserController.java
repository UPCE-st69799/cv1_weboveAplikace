package fei.upce.cz.cv1_weboveAplikace.controller;

import fei.upce.cz.cv1_weboveAplikace.domain.AppUser;
import fei.upce.cz.cv1_weboveAplikace.repository.AppUserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/appUser")
public class UserController {
    private final AppUserRepository appUserRepository;

    public UserController(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    @GetMapping("")
    public List<AppUser> findAll() {
        return appUserRepository.findAllByActiveEquals(true);
    }
}
