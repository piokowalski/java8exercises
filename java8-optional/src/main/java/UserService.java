import java.util.Optional;

// remove all nulls from the code
public class UserService {

    // should return Optional object
    public Optional<User> findUser(String lastName) {
        if ("kowalski".equalsIgnoreCase(lastName)) {
            User u = new User("Jan", "Kowalski", 32);
            return Optional.of(u);
        } else if ("nowak".equalsIgnoreCase(lastName)) {
            return Optional.of(new User("Andrzej", "Nowak", 45));
        }

        return Optional.empty();
        //return Optional.ofNullable(null);
    }

    // avoid throwing NullPointerException when no user found
    public String getUserDetails(String lastName) {
        Optional<User> user = findUser(lastName);
        if (user.isPresent()) {
            return user.get().toString();
        }

        return "";
    }

    // should throw AccessDeniedException if no user found
    public void authorizeUser(String lastName) {
        Optional<User> user = findUser(lastName);
//        if (user.isPresent() == false) { // pusty optional
//            throw new AccessDeniedException("User not authorized");
//        }

        user.orElseThrow(() -> new AccessDeniedException("User not authorized"));
    }
}