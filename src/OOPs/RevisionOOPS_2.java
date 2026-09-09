package OOPs;
class Pokemon{
    private int power;
    String type;
    Pokemon (String type, int power){       // setter
        this.power = power;
        this.type = type;
    }
    Pokemon (int power, String type){       // setter
        this.power = power;
        this.type = type;
    }
    Pokemon(){

    }

    int getPower() {
        return power;
    }

    void print(){   // getter
        System.out.println(this.power+" "+this.type);
    }
}

public class RevisionOOPS_2 {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Electric",70);
        pikachu.type = "Fire";
        // pikachu.power = 34;  //Error
//        Pokemon jigglypuff = new Pokemon("Fairy", 50);
        Pokemon jigglypuff = new Pokemon(50,"Fairy");
        System.out.println(pikachu.getPower());
        pikachu.print(); jigglypuff.print();

        Pokemon gengar = new Pokemon();
        final int x = 89; // x cant be changed

    }
}
