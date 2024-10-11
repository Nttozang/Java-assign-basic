package CollectionFramework;

import CollectionFramework.model.Account;
import CollectionFramework.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapExample {
    private static final String ODD = "ODD";
    private static final String EVEN = "EVEN";

    //ใช้บ่อย
    public static void main(String[] args) {
        hashMapBasic();
        hashMapAdapt();
        hashMapMyself();
    }

    public static void hashMapBasic() {
        // 1 - 20 -> Grouping odd ,even
        HashMap<String, List<Integer>> grouping = new HashMap<>();
        grouping.put(ODD, new ArrayList<>());
        grouping.put(EVEN, new ArrayList<>());
        for (int n =1 ;n <= 10; n++){
            if(n % 2 == 0){
                grouping.get(EVEN).add(n);
            }else {
                grouping.get(ODD).add(n);
            }
            System.out.println(grouping);
        }
    }

    public static void hashMapAdapt() {
        HashMap<Long, Account> userIDMapAccount = new HashMap<>();
        List<User> users = List.of(
                new User(1,"karinaa", new Account(1001)),
                new User(7,"chaewon", new Account(1003)),
                new User(5,"chaewon22", new Account(1004)),
                new User(3,"chaewon31", new Account(1002))

        );
        for(var u : users){
            userIDMapAccount.put(u.id(),u.account());
        }
        System.out.println(userIDMapAccount);
    }

    public static void hashMapMyself() {
        HashMap<String,Integer> fruit = new HashMap<>();
        fruit.put("Apple", 10);
        fruit.put("banana", 30);
        fruit.put("grape", 20);
        fruit.put("mango",null);
        fruit.put(null, 11);
        System.out.println(fruit);

        if(fruit.containsKey("grape")){
            System.out.println("ok");
        }else {
            System.out.println("not ok");
        }
        fruit.remove("Apple");
        System.out.println(fruit);

        for(String f : fruit.keySet()){
            System.out.println("key : " + f + "Value" + fruit.get(f));
        }

    }

}
