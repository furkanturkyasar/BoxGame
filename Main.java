public class Main{
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Michael",10,100,85,50);
        Fighter f2 = new Fighter("Dwight",10,100,90,50);

        Match match = new Match(f1,f2,80,100);
        match.run();

    }

}
