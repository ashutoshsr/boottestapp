package com.scb.eba.EbApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

//@SpringBootApplication
public class FetchHeroes implements CommandLineRunner {

  @Autowired private HeroRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(FetchHeroes.class, args);
  }

  @Override
  public void run(String... args) throws Exception {


    //    repository.deleteAll();

    // save a couple of Heros
    //    repository.save(new Hero(213212, "Smith"));
    repository.insert(new Hero(24243, "Smith"));

    // fetch all Heros
    System.out.println("Heros found with findAll():");
    System.out.println("-------------------------------");
    for (Hero hero : repository.findAll()) {
      System.out.println("Hero ID " + hero.getId());
    }
    System.out.println();

    // fetch an individual Hero
    System.out.println("Hero found with findByFirstName('Alice'):");
    System.out.println("--------------------------------");
    System.out.println(repository.findByName("Smith"));

  }
}
