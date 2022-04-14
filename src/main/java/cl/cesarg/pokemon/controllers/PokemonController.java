package cl.cesarg.pokemon.controllers;

import cl.cesarg.pokemon.entities.*;
import cl.cesarg.pokemon.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("V1")
public class PokemonController {

    @Value("${pokemon.api.paged}")
    private String pokemonApiPaged;

    @Autowired
    private PokemonService pokemonService;

    @GetMapping("/list")
    public DataGrid getListPokemon (@RequestParam(name = "page", required = false) Integer page ) {

        DataGrid dataGrid = new DataGrid();
        List<PokedexItem> result = new ArrayList<>();

        PokemonList pokemonList = null;
        // Get the first part of the data to obtain the detail of each character
        if (page != null) {
            pokemonList = pokemonService.getPagedList(page * Integer.parseInt(pokemonApiPaged));
        } else {
            pokemonList = pokemonService.getPagedList();
        }

        // Process the obtained information
        if (pokemonList != null) {

            dataGrid.setTotal(pokemonList.getCount());
            dataGrid.setActualPage(page);
            Double totalPages = Double.valueOf(pokemonList.getCount() / Integer.parseInt(pokemonApiPaged));
            dataGrid.setTotalPages((int) Math.ceil( totalPages ));

            for (PokemonSimple pokemonSimple : pokemonList.getResults()) {

                // Extract the ID value
                String pokemonId = pokemonSimple.getUrl().substring(34).replace("/", "");

                // First part of the details
                PokemonForm pokemonForm = pokemonService.getPokemonForm( Integer.parseInt(pokemonId) );
                PokemonDetail pokemonDetail = pokemonService.getPokemonDetail( Integer.parseInt(pokemonId) );

                if (pokemonForm != null && pokemonDetail != null) {
                    // Fill the result item
                    PokedexItem pokedexItem = new PokedexItem();
                    pokedexItem.setId(Integer.parseInt(pokemonId));
                    pokedexItem.setName(pokemonForm.getName());
                    List<String> types = new ArrayList<>();
                    for(PokemonType singleType : pokemonForm.getTypes()) {
                        types.add(singleType.getType().getName());
                    }
                    pokedexItem.setTypes( String.join(", ", types));
                    pokedexItem.setIs_battle_only( pokemonForm.isIs_battle_only() );
                    pokedexItem.setPicture(pokemonForm.getSprites().getFront_default());
                    // Fill with another requested data
                    pokedexItem.setWeight(pokemonDetail.getWeight());
                    List<String> abilities = new ArrayList<>();
                    for( PokemonAbility pokemonAbility : pokemonDetail.getAbilities()) {
                        abilities.add(pokemonAbility.getAbility().getName());
                    }
                    pokedexItem.setAbilities(String.join(",", abilities));
                    result.add(pokedexItem);
                }
            }
        }
        // Finally return the result data
        dataGrid.setData(result);
        return dataGrid;
    }


    @GetMapping("/detail/{id}")
    public PokemonDetail getDetail (@PathVariable(name = "id", required = true) Integer id) {
        PokemonDetail pokemonDetail = pokemonService.getPokemonDetail(id);
        return pokemonDetail;
    }


    @GetMapping("/ability/{id}")
    public List<Ability> getAbilities (@PathVariable(name = "id", required = true) Integer id) {
        List<Ability> abilities = new ArrayList<>();
        PokemonAbilityDetails pokemonAbilityDetails = pokemonService.getPokemonAbilityDetail(id);
        for (PokemonEffect pokemonEffect : pokemonAbilityDetails.getEffect_entries()) {
            if (pokemonEffect.getLanguage().getName().equals("en")) {
                Ability ability = new Ability();
                ability.setDescription(pokemonEffect.getEffect());
                ability.setShortDescription(pokemonEffect.getShort_effect());
                abilities.add(ability);
            }
        }
        return abilities;
    }


}
