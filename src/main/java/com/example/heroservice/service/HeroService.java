package com.example.heroservice.service;

import com.example.heroservice.model.Hero;
import com.example.heroservice.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HeroService {

    @Autowired
    private HeroRepository heroRepository;

    public List<Hero> getAllHeroes() {
        return heroRepository.findAll();
    }

    public Optional<Hero> getHeroById(String id) {
        return heroRepository.findById(id);
    }

    public Hero saveHero(Hero hero) {
        return heroRepository.save(hero);
    }

    public void deleteHero(String id) {
        heroRepository.deleteById(id);
    }
}
