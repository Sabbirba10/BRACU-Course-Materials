public class PokemonTester{
    public static void main(String[] args){
        Pokemon pikachu = new Pokemon("Pikachu");
        pikachu.attack();
        pikachu.attack("Thunderbolt");
        pikachu.attack("Iron Tail", 90); 
    }
}
