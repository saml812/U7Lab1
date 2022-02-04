import java.util.ArrayList;

public class Runner {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("pine");
        list.add("maple");
        list.add("frasier fir");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(1));

        ArrayList<String> names = new ArrayList<String>();
        names.add("Benji");
        names.add("Andy");
        String[] moreNames = {"Crystal", "Monica", "Toby"};
        int lengths = names.size() + moreNames.length + names.get(0).length() + moreNames[0].length();
        System.out.println(lengths);

        Cat forest = new Cat("forest");
        Cat grump = new Cat("grump");
        Cat gum = new Cat("gum");
        Cat gek = new Cat("gek");
        Cat gen = new Cat("gen");
        ArrayList<Cat> Tails = new ArrayList<>();
        Tails.add(forest);
        Tails.add(grump);
        Tails.add(gum);
        Tails.add(gek);
        Cat newCat = gen;
        Tails.set(2, newCat);
        System.out.println(Tails);
        Tails.get(1).setName("Archie");
        System.out.println(Tails);

        ArrayList<Dog> dogList = new ArrayList();
        Dog dog1 = new Dog("Spot");
        Dog dog2 = new Dog("Benny");
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.get(0).bark();
    }
}

