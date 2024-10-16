package mostusedinterview;

import java.util.HashMap;

public class MapForInterview {
    private record Studernt(int id,String name){}

    public static void main(String[] args) {

        HashMap<Integer,Studernt> hashMap = new HashMap<>();

        hashMap.put(1,new Studernt(1,"kari"));
        hashMap.put(2,new Studernt(1,"ningging"));
        hashMap.put(3,new Studernt(1,"niaerasr"));

        String message = "A53gfg%^45err%$#ft6t";
        HashMap<Character, Integer> freqMap = new HashMap<>();
        /*for (char c : message.toCharArray()){
            freqMap.putIfAbsent(c,0);
            freqMap.put(c,freqMap.get(c)+1);
            System.out.println(freqMap.get(c));
        }*/
        System.out.println(hashMap.entrySet());
        System.out.println(hashMap.get(2));
    }
}
