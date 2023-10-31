package DB;

import Users.User;

import java.util.HashMap;
import java.util.Map;

public class Database {
    Map<Integer, User> users;
    private static Database db = null;
    private Database() {
        this.users = new HashMap<>();
    }
    public static synchronized Database getDb() {
        if(db == null) {
            db = new Database();
        }
        return db;
    }

    public void save(User user) {
        users.put(user.getID(), user);
    }

    public User get(int id) {
        return users.get(id);
    }

}
