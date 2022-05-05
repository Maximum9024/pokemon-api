package za.co.pokemon.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import za.co.pokemon.model.Pokemon;

@RestController
@RequestMapping("/api")
public class PokemonController {
	
	@Autowired
	private RestTemplate restTemplate;


	public static final String URL="https://pokeapi.co/api/v2/pokemon";
	
	@GetMapping("/getPokemon")
	public Pokemon getPokemon() {
		
		Pokemon pokemon= restTemplate.getForObject(URL, Pokemon.class);	
		return pokemon;
	}
}
