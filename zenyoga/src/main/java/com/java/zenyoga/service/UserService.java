// package com.java.zenyoga.service;

// import com.java.zenyoga.model.User;
// import com.java.zenyoga.repository.UserRepository;

// import lombok.RequiredArgsConstructor;

// import org.springframework.stereotype.Service;

// import java.util.List;

// @Service
// @RequiredArgsConstructor
// public class UserService {

//     private final UserRepository userRepository;

    

//     public User createUser(User user) {
//         return userRepository.save(user);
//     }

//     public User getUserById(String userId) {
//         return userRepository.findById(userId).orElse(null);
//     }

//     public User updateUser(String userId, User user) {
//         if (userRepository.existsById(userId)) {
//             user.setId(userId); // Ensure the user id is set for update
//             return userRepository.save(user);
//         }
//         return null; // User not found
//     }

//     public boolean deleteUser(String userId) {
//         if (userRepository.existsById(userId)) {
//             userRepository.deleteById(userId);
//             return true;
//         }
//         return false; // User not found
//     }

//     public List<User> getAllUsers() {
//         return userRepository.findAll();
//     }
// }
