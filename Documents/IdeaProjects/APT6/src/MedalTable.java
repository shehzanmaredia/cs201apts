import java.util.*;

public class MedalTable {
    public String[] generate(String[] results) {



        Map<String, MedalCountry> m = new HashMap<>();
        for(String s : results){
            String[] data = s.split(" ");
            for(int k = 0; k< 3; k++){
                m.putIfAbsent(data[k], new MedalCountry(data[k]));
                if(k == 0){
                    m.get(data[k]).gold++;
                }else if(k == 1){
                    m.get(data[k]).silver++;
                }else if(k == 2){
                    m.get(data[k]).bronze++;
                }
            }
        }


        ArrayList<MedalCountry> list = new ArrayList<>(m.values());
        Comparator comp = Comparator.comparing(MedalCountry::getGold).reversed().thenComparing((Comparator.comparing(MedalCountry::getSilver)).reversed()).thenComparing((Comparator.comparing(MedalCountry::getBronze)).reversed()).thenComparing(Comparator.comparing(MedalCountry::getCountry));


        Collections.sort(list, comp);
        String[] arr = new String[list.size()];


        for(int i = 0; i < arr.length; i++){
            arr[i] = list.get(i).getCountry() + " " + list.get(i).getGold() +  " " + list.get(i).getSilver() + " " + list.get(i).getBronze();
        }
        return arr;
    }
}

class MedalCountry{


    int gold;
    int silver;
    int bronze;
    String name;
    MedalCountry(String country){
        name = country;
    }

    int getGold() {
        return gold;
    }

    int getSilver() {
        return silver;
    }

    int getBronze() {
        return bronze;
    }

    String getCountry() {
        return name;
    }
}