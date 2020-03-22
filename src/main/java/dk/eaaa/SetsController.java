package dk.eaaa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.function.client.WebClient;

import dk.eaaa.model.PokemonSets;
import reactor.core.publisher.Mono;

@Controller
public class SetsController {
	
	@GetMapping("/")
	public String sets(Model model) {
		WebClient webClient = WebClient.builder().baseUrl("https://api.pokemontcg.io").build();
		Mono<PokemonSets> result = webClient.get().uri("/v1/sets?standardLegal=true").retrieve().bodyToMono(PokemonSets.class);
		model.addAttribute("PokemonSets", result.block().getSets());
		return ("sets");
	}
}
