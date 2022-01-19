public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;
    double whoStarts;



    Fighter(String name, int damage, int health, int weight, double dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
        whoStarts = Math.random() * 100;


    }


    int hit(Fighter foe){
        if (foe.isDodge()){
            System.out.println("Hasar dodge'landi!");
            return foe.health;
        }
        return foe.health = (foe.health - this.damage);
    }

    boolean isDodge(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= dodge;
    }



}
