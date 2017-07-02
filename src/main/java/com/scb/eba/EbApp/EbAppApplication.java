package com.scb.eba.EbApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@SpringBootApplication
@RestController
public class EbAppApplication {

	private Hero[] heroes = { new Hero(1560601, "Ravi"), new Hero(1560982, "Yashprit"),
			new Hero(1561137, "Vikasss"), new Hero(1560604, "Ashutosh"), new Hero(1560501, "Chaitanyas") };
    private List<Hero> changeHeroes = Arrays.asList(heroes);
    private List<Hero> newHeroes = new ArrayList<>();
    
	
	public static void main(String[] args) {
		SpringApplication.run(EbAppApplication.class, args);
	}

  @RequestMapping(value = "/greeting", method = RequestMethod.GET)
  public List<Hero> greeting() {
		newHeroes.addAll(changeHeroes);
		return newHeroes;
	}

  //	@RequestMapping(value = "/greeting/{id}", method = RequestMethod.PUT)
  //	public void update(@PathVariable("id") String id) {
  //		System.out.println("id = " + id + " and name is > ");
  //		for (Hero hero : heroes) {
  //			if (hero.getId() == Integer.valueOf(id)) {
  //				System.out.println("id = " + id + " and name is > ");
  //			}
  //		}
  //	}

  @CrossOrigin(origins = "http://localhost:3000")
  @RequestMapping(value = "/greeting", method = RequestMethod.POST)
  public void create(@RequestBody Hero hero) {
    System.out.println("id = " + hero.getId() + " and name is > ");
    newHeroes.add(hero);
    for (Hero hero1 : newHeroes) {
      System.out.println(hero1.getName());
    }
  }

//	@RequestMapping(value = "/greeting/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
//	public void rupdate(@PathVariable("id") int id) {
//		System.out.println(" << DELETING >> id = " + id + " and name is > ");
//		for (Hero hero : heroes) {
//			if (hero.getId() == Integer.valueOf(id)) {
//				System.out.println("id = " + id);
//			}
//		}
//	}

}
