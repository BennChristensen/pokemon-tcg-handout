package dk.eaaa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.reactive.function.client.WebClient;

import dk.eaaa.model.PokemonCards;
import dk.eaaa.model.CardWrapper;
import dk.eaaa.model.PokemonCard;
import reactor.core.publisher.Mono;

@Controller
public class CardController {

	@GetMapping("/cards")
	public String cards(@RequestParam(name="set", required=false, defaultValue="World") String set, Model model) {
		WebClient webClient = WebClient.builder().baseUrl("https://api.pokemontcg.io").build();
		Mono<PokemonCards> result = webClient.get().uri("/v1/cards?setCode=" + set).retrieve().bodyToMono(PokemonCards.class);
		model.addAttribute("PokemonCards", result.block().getCards());
		return "cards";
	}
	
	@GetMapping("/cards/{id}")
	public String getCard(@PathVariable String id, Model model) {
		WebClient webClient = WebClient.builder().baseUrl("https://api.pokemontcg.io").build();
		Mono<CardWrapper> result = webClient.get().uri("/v1/cards/" + id)
				.retrieve().bodyToMono(CardWrapper.class);
		model.addAttribute("PokemonCard", result.block().getCard());
		return "card";
	}
}
