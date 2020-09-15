package classwork6_interface;

public class EPokemon extends Pokemon {
    public void b() {
        System.out.print("EPokemon b ");
    }
}
class Pokemon {
    public void a() {
        System.out.print("Pokemon a ");
        b();
    }

    public void b() {
        System.out.print("Pokemon b ");
    }

    public String toString() {
        return "Pokemon";
    }
}
class Raichu extends Pikachu {
    public void b() {
        System.out.print("Raichu b ");
    }
}
class Pikachu extends EPokemon {
    public void a() {
        System.out.print("Pikachu a ");
        super.a();
    }

    public String toString() {
        return "Pikachu";
    }
}

