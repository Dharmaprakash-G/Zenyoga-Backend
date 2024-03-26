// package com.java.zenyoga.controller;

// import com.java.zenyoga.model.User;
// import com.java.zenyoga.service.UserService;

// import io.swagger.v3.oas.annotations.tags.Tag;
// import lombok.RequiredArgsConstructor;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;

// @RestController
// @RequiredArgsConstructor
// @RequestMapping("/users")
// @Tag(name="USER")
// public class UserController {

//     private final UserService userService;


//     // Create operation
//     // @PostMapping("/create")
//     // public ResponseEntity<User> createUser(@RequestBody User user) {
//     //     User newUser = userService.createUser(user);
//     //     return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
//     // }

//     // Read operation
//     @GetMapping("/{userId}")
//     public ResponseEntity<User> getUserById(@PathVariable String userId) {
//         User user = userService.getUserById(userId);
//         if (user != null) {
//             return ResponseEntity.ok(user);
//         } else {
//             return ResponseEntity.notFound().build();
//         }
//     }

//     // Update operation
//     @PutMapping("/{userId}")
//     public ResponseEntity<User> updateUser(@PathVariable String userId, @RequestBody User user) {
//         User updatedUser = userService.updateUser(userId, user);
//         if (updatedUser != null) {
//             return ResponseEntity.ok(updatedUser);
//         } else {
//             return ResponseEntity.notFound().build();
//         }
//     }

//     // Delete operation
//     @DeleteMapping("/{userId}")
//     public ResponseEntity<String> deleteUser(@PathVariable String userId) {
//         boolean deleted = userService.deleteUser(userId);
//         if (deleted) {
//             return ResponseEntity.ok("User deleted successfully");
//         } else {
//             return ResponseEntity.notFound().build();
//         }
//     }

//     // List all users
//     // @GetMapping("/all")
//     // public ResponseEntity<List<User>> getAllUsers() {
//     //     List<User> users = userService.getAllUsers();
//     //     return ResponseEntity.ok(users);
//     // }
// }
