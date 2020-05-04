import java.util.*;

public class GrammesDeux {

    String p;
    public ArrayList<String> wordsList2 = new ArrayList<String>();
    public static int counter;

    public GrammesDeux(String phrase) {
        this.p = phrase;
       // input();
        /*
        System.out.println();
        System.out.println("1-grammes de la phrase " + nombreObjets() + " = " + nGrammes1(wordsList2));
        System.out.println();
        nGrammes2(wordsList2);
        System.out.println();
        nGrammes3(wordsList2);
        System.out.println();
        nGrammes4(wordsList2);
         */
        counter ++;
        nombreObjets();
    }

    public String getPhrase1() {
        return p;
    }

    public void setPhrase1(String phrase) {
        this.p = phrase;
    }

    public String nombreObjets() {
        String x = "";
        if (counter < 1) {
            x = "1";
        }
        else if (counter >= 1) {
            x = "2";
        }
        return x;
    }

    public ArrayList<String> input() {
        ArrayList<ArrayList<String>> test2 = new ArrayList<ArrayList<String>>();


        String[] words = p.split("[^a-zA-Z]");
        List wordsList = Arrays.asList(words);

        for (int i = 0; i < wordsList.size(); i++) {
            if (!wordsList.get(i).equals("")) {
                wordsList2.add(wordsList.get(i).toString());
            }
        }
        return wordsList2;
    }

    public String texte(ArrayList<ArrayList<String>> list) {
        String mot = "";



        return mot;
    }
/*
    public ArrayList<ArrayList<String>> testing() {
        return nGrammes1(wordsList2);
    }

 */

/*
    public ArrayList<ArrayList<String>> nGrammes1(ArrayList<String> list) {
        ArrayList<ArrayList<String>> megaList = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < list.size(); i++) {
            ArrayList<String> list2 = new ArrayList<String>();
            if (i < list.size()) {
                list2.add(list.get(i));
                megaList.add(list2);
            }
        }

        return megaList;
    }

 */

public void print () {
    System.out.println(nGrammes1(input()));
}

    public List<List<String>> nGrammes1(List<String> list) {
        List<List<String>> megaList = new ArrayList<>();
        for (String s : list) {
            List<String> list2 = new ArrayList<>();
            list2.add(s);
            megaList.add(list2);
        }
        return megaList;
    }

    public void nGrammes2(ArrayList<String> list) {
        ArrayList<ArrayList<String>> megaList = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < list.size(); i++) {
            ArrayList<String> list2 = new ArrayList<String>();
            if (i < list.size()-1) {
                list2.add(list.get(i));
                list2.add(list.get(i + 1));
                megaList.add(list2);
            }
        }
        System.out.println("2-grammes de la phrase " + nombreObjets() + " = " + megaList);
    }

    public void nGrammes3(ArrayList<String> list) {
        ArrayList<ArrayList<String>> megaList = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < list.size(); i++) {
            ArrayList<String> list2 = new ArrayList<String>();
            if (i < list.size()-2) {
                list2.add(list.get(i));
                list2.add(list.get(i + 1));
                list2.add(list.get(i+2));
                megaList.add(list2);
            }
        }
        System.out.println("3-grammes de la phrase " + nombreObjets() + " = " + megaList);
    }

    public void nGrammes4(ArrayList<String> list) {
        ArrayList<ArrayList<String>> megaList = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < list.size(); i++) {
            ArrayList<String> list2 = new ArrayList<String>();
            if (i < list.size()-3) {
                list2.add(list.get(i));
                list2.add(list.get(i + 1));
                list2.add(list.get(i+2));
                list2.add(list.get(i+3));
                megaList.add(list2);
            }
        }
        System.out.println("4-grammes de la phrase " + nombreObjets() + " = " + megaList);
    }


}
