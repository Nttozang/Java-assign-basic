package CollectionFramework;

import CollectionFramework.model.Account;
import CollectionFramework.model.User;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

public class TreeMapEaxmple {
    public static void main(String[] args) {
        TreeMap<Long, Account> userIDMapAccount = new TreeMap<>();
        List<User> users = List.of(
                new User(1,"karinaa", new Account(1001)),
                new User(7,"chaewon", new Account(1003)),
                new User(5,"chaewon22", new Account(1004)),
                new User(3,"chaewon31", new Account(1002)),
                new User(2,"chaewon31", new Account(1005))
        );
        for(var u : users){
            userIDMapAccount.put(u.id(),u.account());
        }
        System.out.println(userIDMapAccount);
    }
}
