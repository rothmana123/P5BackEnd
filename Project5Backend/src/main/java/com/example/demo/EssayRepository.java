package com.example.demo;

import java.util.List;

import com.google.cloud.spring.data.datastore.repository.DatastoreRepository;

public interface EssayRepository extends DatastoreRepository<Essay, Long> {
  
  List<Essay> findByAuthor(String author);

  List<Essay> findByTextContains(String text);

  List<Essay> findByAuthorAndStudentID(String author, String studentID);

  void deleteByAuthor(String author);

}
