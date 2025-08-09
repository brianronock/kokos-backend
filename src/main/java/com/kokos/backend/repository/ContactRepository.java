package com.kokos.backend.repository;

import com.kokos.backend.models.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactRepository extends MongoRepository<Contact, String> {
    // Additional query methods can be defined here if needed

    // For example, to find contacts by email:
    // List<Contact> findByEmail(String email);
    // Or to find contacts by school name:
    // List<Contact> findBySchoolName(String schoolName);
    // You can also define custom queries using @Query annotation if needed
    // Example:
    // @Query("{ 'schoolName': ?0 }")
    // List<Contact> findBySchoolName(String schoolName);

}
