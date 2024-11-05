package com.example.WouldYouPreferAnimeJava.classes;
import com.example.WouldYouPreferAnimeJava.models.usersModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public interface userRepository extends MongoRepository<usersModel, String>{

    usersModel findByEmail(String Email);

}
