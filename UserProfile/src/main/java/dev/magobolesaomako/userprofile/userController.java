package dev.magobolesaomako.userprofile;

import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class userController {
    // List to store user profiles
    private List<UserProfile> profiles;

    // Initialize the user profiles on application start
    @PostConstruct
    public void init(){
        profiles = new ArrayList<>();
        profiles.add(new UserProfile("Dave", 20, "dave@gmail.com", "SA"));
        profiles.add(new UserProfile("Magobo", 30,
                "zach@gmail.com", "SA"));
        profiles.add(new UserProfile("Botshelo", 35, "tsheks@gmail.com", "Zim"));
    }

    @GetMapping("/users/{username}")
    public ResponseEntity<String> getUserProfileByUsername(@PathVariable String username){
        // Find iser by username
        UserProfile profile = profiles.stream()
                .filter(p -> p.getUsername().equalsIgnoreCase(username))
                .findFirst().orElse(null);

        // Return user details or error message

        if (profile != null) {
            return new ResponseEntity<>("Username: " +
                    profile.getUsername() + ", Age: " + profile.getAge() +
                    ", Email: " + profile.getEmail() +
                    ", Country: " + profile.getCountry(), HttpStatus.OK
                    );
        } else {
            return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/users")
    public ResponseEntity<String> listProfilesByAge(@RequestParam(required = false) Integer age){
        List<UserProfile> filteredProfiles;

        //Filter by age if provided
        if (age != null) {
            filteredProfiles = profiles.stream().filter(p -> p.getAge() == age)
                    .toList();
        } else {
            filteredProfiles = profiles;
        }

        StringBuilder response = new StringBuilder();
        for (UserProfile profile: filteredProfiles){
            response.append("username: ").append(profile.getUsername())
                    .append(", Age: ").append(profile.getAge())
                    .append(", Email: ").append(profile.getEmail())
                    .append(", Country: ").append(profile.getCountry())
                    .append("\\n");
        }

        return !response.isEmpty() ? new ResponseEntity<>(response.toString(), HttpStatus.OK) :
                new ResponseEntity<>("No user found", HttpStatus.NOT_FOUND);
    }

}
