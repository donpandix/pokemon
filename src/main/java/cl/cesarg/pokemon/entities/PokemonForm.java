package cl.cesarg.pokemon.entities;

import java.util.ArrayList;

public class PokemonForm {

    private String form_name;
    private ArrayList<PokemonName> form_names;
    private int form_order;
    private int id;
    private boolean is_battle_only;
    private boolean is_default;
    private boolean is_mega;
    private String name;
    private ArrayList<PokemonName> names;
    private int order;
    private PokemonSimple pokemon;
    private PokemonSprites sprites;
    private ArrayList<PokemonType> types;
    private PokemonSimple version_group;


    public String getForm_name() {
        return form_name;
    }

    public void setForm_name(String form_name) {
        this.form_name = form_name;
    }

    public ArrayList<PokemonName> getForm_names() {
        return form_names;
    }

    public void setForm_names(ArrayList<PokemonName> form_names) {
        this.form_names = form_names;
    }

    public int getForm_order() {
        return form_order;
    }

    public void setForm_order(int form_order) {
        this.form_order = form_order;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIs_battle_only() {
        return is_battle_only;
    }

    public void setIs_battle_only(boolean is_battle_only) {
        this.is_battle_only = is_battle_only;
    }

    public boolean isIs_default() {
        return is_default;
    }

    public void setIs_default(boolean is_default) {
        this.is_default = is_default;
    }

    public boolean isIs_mega() {
        return is_mega;
    }

    public void setIs_mega(boolean is_mega) {
        this.is_mega = is_mega;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<PokemonName> getNames() {
        return names;
    }

    public void setNames(ArrayList<PokemonName> names) {
        this.names = names;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public PokemonSimple getPokemon() {
        return pokemon;
    }

    public void setPokemon(PokemonSimple pokemon) {
        this.pokemon = pokemon;
    }

    public PokemonSprites getSprites() {
        return sprites;
    }

    public void setSprites(PokemonSprites sprites) {
        this.sprites = sprites;
    }

    public ArrayList<PokemonType> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<PokemonType> types) {
        this.types = types;
    }

    public PokemonSimple getVersion_group() {
        return version_group;
    }

    public void setVersion_group(PokemonSimple version_group) {
        this.version_group = version_group;
    }
}
