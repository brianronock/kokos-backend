package com.kokos.backend.controller;

import com.kokos.backend.models.Contact;
import com.kokos.backend.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {
    @Autowired
    private ContactRepository repository;

    @PostMapping
    public Contact createContact(@RequestBody Contact contact) {
        contact.setSubmittedAt(LocalDateTime.now());
        return repository.save(contact);
    }

    @GetMapping
    public List<Contact> getContacts() {
        return repository.findAll();
    }
}
