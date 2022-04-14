package cl.cesarg.pokemon.services;

import cl.cesarg.pokemon.entities.PokemonAbilityDetails;
import cl.cesarg.pokemon.entities.PokemonDetail;
import cl.cesarg.pokemon.entities.PokemonForm;
import cl.cesarg.pokemon.entities.PokemonList;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class PokemonService {

    @Value("${pokemon.api.url}")
    private String pokemonApiUrl;

    @Value("${pokemon.api.paged}")
    private String pokemonApiPaged;


    public PokemonList getPagedList() {
        return this.getPagedList(0);
    }

    /**
     * Get the simple list of the availables pokemons!
     * @param offset
     * @return
     */
    public PokemonList getPagedList(int offset) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<PokemonList> response =  restTemplate.getForEntity(pokemonApiUrl + "/pokemon/?limit="+pokemonApiPaged+"&offset=" + String.valueOf(offset), PokemonList.class);
        return response.getBody();
    }

    /**
     * Get a form detail of each pokemon
     * @param id
     * @return
     */
    public PokemonForm getPokemonForm(int id) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<PokemonForm> response = restTemplate.getForEntity(pokemonApiUrl + "/pokemon-form/"+String.valueOf(id)+"/", PokemonForm.class);
        return response.getBody();
    }


    /**
     * Get all de detail of the pokemon
     * @param id
     * @return
     */
    public PokemonDetail getPokemonDetail(int id) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<PokemonDetail> response = restTemplate.getForEntity(pokemonApiUrl + "/pokemon/"+String.valueOf(id)+"/", PokemonDetail.class);
        return response.getBody();
    }



    public PokemonAbilityDetails getPokemonAbilityDetail(int id) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<PokemonAbilityDetails> response = restTemplate.getForEntity(pokemonApiUrl + "/ability/"+String.valueOf(id)+"/", PokemonAbilityDetails.class);
        return response.getBody();
    }

}
