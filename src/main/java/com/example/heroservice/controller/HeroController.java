package com.example.heroservice.controller;

import com.example.heroservice.model.Hero;
import com.example.heroservice.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/heroes")
public class HeroController {

    @Autowired
    private HeroService heroService;

    @GetMapping
    public List<Hero> getAllHeroes() {
        return heroService.getAllHeroes();
    }

    @GetMapping("/{id}")
    public Optional<Hero> getHeroById(@PathVariable String id) {
        return heroService.getHeroById(id);
    }

    @PostMapping
    public Hero createHero(@RequestBody Hero hero) {
        return heroService.saveHero(hero);
    }

    @PutMapping("/{id}")
    public Hero updateHero(@PathVariable String id, @RequestBody Hero hero) {
        hero.setId(id);
        return heroService.saveHero(hero);
    }

    @DeleteMapping("/{id}")
    public void deleteHero(@PathVariable String id) {
        heroService.deleteHero(id);
    }
}
