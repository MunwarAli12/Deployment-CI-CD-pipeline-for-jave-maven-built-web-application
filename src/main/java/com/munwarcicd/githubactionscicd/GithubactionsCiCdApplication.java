package com.munwarcicd.githubactionscicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubactionsCiCdApplication {
	@GetMapping("/welcome")
	public String welcome(){
		return "CHECKING WHETHER THE PIPELING IS GENERATING OR NOT !!!!!!    chjdbchdcbdcdihcbaciabcsichbciahbcadsihcbadcihdbfwdihcbdwfhiwbfih	wlrbvwihvbwdivhbwvhwhebwejfbwefvjdwnvdwjvnwv;ljdvn;dslvn";
	}
	@PostMapping("/users")
public String createUser(@RequestBody User user) {
    // Basic logic to create a user
    if (user.getUsername() != null && user.getEmail() != null) {
        // Save the user to the database or perform any other required operations
        return "User created successfully: " + user.getUsername();
    } else {
        return "Failed to create user. Invalid data provided.";
    }
}

@GetMapping("/users/{id}")
public String getUser(@PathVariable("id") int id) {
    // Basic logic to get user by ID
    // Retrieve the user from the database or any other data source
    User user = userRepository.findById(id);
    if (user != null) {
        return "User with ID " + id + " retrieved. Username: " + user.getUsername();
    } else {
        return "User with ID " + id + " not found.";
    }
}

@DeleteMapping("/users/{id}")
public String deleteUser(@PathVariable("id") int id) {
    // Basic logic to delete user by ID
    // Delete the user from the database or any other data source
    boolean isDeleted = userRepository.deleteById(id);
    if (isDeleted) {
        return "User with ID " + id + " deleted successfully.";
    } else {
        return "Failed to delete user. User with ID " + id + " not found.";
    }
}


	public static void main(String[] args) {
		SpringApplication.run(GithubactionsCiCdApplication.class, args);
	}

}
//echo "# munwarrrrrrrr" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/MunwarAli12/munwarrrrrrrr.git
//git push -u origin main
