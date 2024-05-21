package java_niit;

public class ATM {
    static UserInfo[] users = {
        new UserInfo("001", "user1", "123456", 10000000),
        new UserInfo("002", "user2", "123467", 5000000)
    };

    public static UserInfo check(String userId, String password) {
        for (UserInfo user : users) {
            if (user.getUserId().equals(userId) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
    
}