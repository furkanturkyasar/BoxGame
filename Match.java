public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;


    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

    }

    void run(){
        if (isCheck()){
            while (true){

                System.out.println("------------");


                if (f1.whoStarts > f2.whoStarts){

                    System.out.println(f1.name+" hasar verdi: "+f1.damage);
                    f2.health = f1.hit(f2);
                    if (f2.health <= 0){
                        f2.health = 0;
                        System.out.println("Dwight öldu!");
                        break;
                    }
                    System.out.println(f2.name+" canı: "+f2.health);
                    isWin();

                    System.out.println(f2.name+" hasar verdi: "+f2.damage);
                    f1.health = f2.hit(f1);
                    if (f1.health <= 0){
                        f1.health = 0;
                        System.out.println("Michael öldu!");
                        break;
                    }
                    System.out.println(f1.name+" canı: "+f1.health);
                    isWin();

                }else {
                    System.out.println(f2.name+" hasar verdi: "+f2.damage);
                    f1.health = f2.hit(f1);
                    if (f1.health <= 0 ){
                        f1.health = 0;
                        System.out.println("Michael öldu!");
                        break;
                    }
                    System.out.println(f1.name+" canı: "+f1.health);
                    isWin();

                    System.out.println(f1.name+" hasar verdi: "+f1.damage);
                    f2.health = f1.hit(f2);
                    if (f2.health <= 0 ){
                        f2.health = 0;
                        System.out.println("Dwight öldu!");
                        break;
                    }
                    System.out.println(f2.name+" canı: "+f2.health);
                    isWin();

                }


            }
        }else {
            System.out.println("Sikletler uymuyor!");
        }

    }


    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    void isWin(){
        if (this.f1.health == 0){
            System.out.println(this.f2.name+" "+ "kazandi!");
        }

        if (this.f2.health == 0){
            System.out.println(this.f1.name+" "+ "kazandi!");
        }

    }



}
