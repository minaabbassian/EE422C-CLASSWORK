package classwork6_interface;

public class PokemonMain {

	public static void main(String[] args) {
		Pokemon[] monsters = {new EPokemon(), new Pokemon(), new Raichu(), new Pikachu()};
		for (int i = 0; i < monsters.length; i++) {
		    System.out.println(monsters[i]);
		    monsters[i].a();
		    System.out.println();     // to end the line of output
		    monsters[i].b();
		    System.out.println();     // to end the line of output
		    System.out.println();
		}

	}
}
