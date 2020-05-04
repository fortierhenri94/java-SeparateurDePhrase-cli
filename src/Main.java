import java.lang.reflect.Array;
import java.util.*;

/**
 * Travail réalisé SEUL par :
 * Henri Fortier
 * FORH16059401
 * Groupe 010
 * 15 Avril 2020
 */

/**
 * TO DO
 *
 * - M<ASSURER QUE JE COMPRENDS TOUT MON CODE DE A a Z easy !!!
 *
 */

public class Main {


   public static ArrayList<String> wordsList2 = new ArrayList<String>();
   public static String p1;
   public static String p2;
   public static int counter = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer la phrase générée : ");
        p1 = sc.nextLine();
        System.out.print("Entrer la phrase cible : ");
        p2 = sc.nextLine();
        sc.close();
        GrammesDeux phrase1 = new GrammesDeux(p1);
        GrammesDeux phrase2 = new GrammesDeux(p2);
        phrase1.nGrammes1(phrase1.input());
        System.out.println();
        System.out.println("test");
        phrase1.print();
        System.out.println(phrase1.nGrammes1(phrase1.input()));

    }

    public static int calculC1() {
        int c1 = 0;
        GrammesDeux phrase1 = new GrammesDeux(p1);
        GrammesDeux phrase2 = new GrammesDeux(p2);
        for (int i = 0; i < phrase1.nGrammes1(phrase1.input()).size(); i++) {
            for (int j = 0; j < phrase1.nGrammes1(phrase1.input()).get(i).size(); j++) {
                if (phrase1.nGrammes1(phrase1.input()).get(i).get(j).equals(phrase2.nGrammes1(phrase2.input()).get(i).get(j))) {
                    System.out.println("reussi");
                }
            }
        }
        System.out.println(counter);
        return c1;
    }

    public static void calculC12() {
        GrammesDeux phrase1 = new GrammesDeux(p1);
        GrammesDeux phrase2 = new GrammesDeux(p2);
        phrase1.nGrammes1(wordsList2).retainAll(phrase2.nGrammes1(wordsList2));
        System.out.println(phrase1.nGrammes1(wordsList2));
    }


    public static ArrayList<String> input() {
        Scanner sc = new Scanner(System.in);
        String p1 = sc.nextLine();
        sc.close();
        ArrayList<ArrayList<String>> test2 = new ArrayList<ArrayList<String>>();
        String[] words = p1.split("[^a-zA-Z]");
        List wordsList = Arrays.asList(words);
        for (int i = 0; i < wordsList.size(); i++) {
            if (!wordsList.get(i).equals("")) {
               wordsList2.add(wordsList.get(i).toString());
            }
        }

        System.out.println(p1);
        System.out.println(wordsList);
        System.out.println(wordsList2);
        return wordsList2;

        /*
        for (int i = 0; i < wordsList.size(); i++) {
            if (wordsList.get(i).equals("")) {
                wordsList.remove(i);
            }
        }

         */

      //  while(wordsList.remove(null));

       /* for (int i = 0; i < p1.length(); i++) {
            if (!p1.matches("^[a-zA-Z]+$")) {

            }
        }
        */
      /*  for (int i = 0; i < test2.size(); i ++) {
            if (p1.equals("allo")) {
                ArrayList<String> miniList = new ArrayList<String>();
                test2.add(miniList);
                test2.get(0).add(p1);
            }
        }

       */



        /**
         * faire marcher un print : de arraylist de arraylist de string rempli dun input scanner et les mettre dans un objet
         * et classe ?
         *
         * ensuite les faire separer en 1-2-3-4 groupes selon les mots
         *
         * et les faire diviser selon les mots et les separateurs
         */

       // Ngrammes test1 = new Ngrammes(test2);

       // System.out.println(test1);
       // System.out.println(test2);

        //System.out.println(Arrays.toString(words));



        /*
        for (int i = 0; i < wordsList.size(); i++){
            System.out.println(wordsList.get(i));
        }

         */

    }

    public static void nGrammes2(ArrayList<String> list) {
        ArrayList<ArrayList<String>> megaList = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < list.size(); i++) {
            ArrayList<String> list2 = new ArrayList<String>();
            if (i < list.size()-1) {
                list2.add(list.get(i));
                list2.add(list.get(i + 1));
                megaList.add(list2);
            }
        }
        System.out.println(megaList);
    }
}
