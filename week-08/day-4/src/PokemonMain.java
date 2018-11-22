import java.util.ArrayList;
import java.util.List;

public class PokemonMain {

  public static void main(String[] args) {
    List<Pokemon> pokemonOfAsh = poolOfPokemons();

    Pokemon wildPokemon = new Pokemon("Oddish", "leaf", "water");
    ArrayList<String> nameOfPokemonToChoose = new ArrayList<>();

    for (int i = 0; i < pokemonOfAsh.size(); i++) {
      if (pokemonOfAsh.get(i).isEffectiveAgainst(wildPokemon)) {
        nameOfPokemonToChoose.add(pokemonOfAsh.get(i).getName());
      }
    }
    System.out.print("I choose you, " + nameOfPokemonToChoose);
  }

  public static List<Pokemon> poolOfPokemons() {
    List<Pokemon> pokemon = new ArrayList<>();

    pokemon.add(new Pokemon("Balbasaur", "leaf", "water"));
    pokemon.add(new Pokemon("Pikatchu", "electric", "water"));
    pokemon.add(new Pokemon("Charizard", "fire", "leaf"));
    pokemon.add(new Pokemon("Balbasaur", "water", "fire"));
    pokemon.add(new Pokemon("Kingler", "water", "fire"));

    return pokemon;
  }

}
