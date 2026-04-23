package B;

class UserService {
    public User findById(int id) {
        return null;
    }
    public void sendWelcomeEmail(User user) { }
    public void sendPasswordResetEmail(User user) { }
    public void renderUserProfile(User user) { }
    public String exportUserToCsv(User user) { return null; }
}
//Class làm quá nhiều việc (Vi pham nguyen tac Single-responsible) / Large Class / Single Responsibility Violation
// Ky thuat Refactor : Extract class

