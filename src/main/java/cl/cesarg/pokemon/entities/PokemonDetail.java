package cl.cesarg.pokemon.entities;

import java.util.List;

public class PokemonDetail {

    private List<PokemonAbility> abilities;
    private int base_experience;
    private List<PokemonSimple> forms;
    private List<PokemonGameIndex> game_indices;
    private Integer height;
    private int id;
    private boolean is_default;
    private String name;
    private PokemonSimple species;
    private PokemonSprites sprites;
    private Integer weight;

    public List<PokemonAbility> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<PokemonAbility> abilities) {
        this.abilities = abilities;
    }

    public int getBase_experience() {
        return base_experience;
    }

    public void setBase_experience(int base_experience) {
        this.base_experience = base_experience;
    }

    public List<PokemonSimple> getForms() {
        return forms;
    }

    public void setForms(List<PokemonSimple> forms) {
        this.forms = forms;
    }

    public List<PokemonGameIndex> getGame_indices() {
        return game_indices;
    }

    public void setGame_indices(List<PokemonGameIndex> game_indices) {
        this.game_indices = game_indices;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIs_default() {
        return is_default;
    }

    public void setIs_default(boolean is_default) {
        this.is_default = is_default;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PokemonSimple getSpecies() {
        return species;
    }

    public void setSpecies(PokemonSimple species) {
        this.species = species;
    }

    public PokemonSprites getSprites() {
        return sprites;
    }

    public void setSprites(PokemonSprites sprites) {
        this.sprites = sprites;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
