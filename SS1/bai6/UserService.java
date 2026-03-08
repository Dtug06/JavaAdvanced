package SS1.bai6;

import java.io.IOException;

class UserService {

    public static void saveToFile(Use user) throws IOException {
        throw new IOException("Không thể ghi file người dùng!");
    }

    public static void processUser(Use user)
            throws IOException {

        saveToFile(user);
    }
}
