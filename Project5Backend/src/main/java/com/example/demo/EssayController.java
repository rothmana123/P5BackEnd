package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class EssayController {
  private final EssayRepository essayRepository;

  @GetMapping("/")
    @CrossOrigin(origins = "*")
    public String home() {
        return "Welcome to the Essay Management API!";
    }

  public EssayController(EssayRepository essayRepository) {
    this.essayRepository = essayRepository;
  }

  

  @PostMapping("/saveEssay")
  @CrossOrigin(origins = "*")
  public String saveEssay(@RequestBody Essay essay) {
    if (essay == null) {
      return "The essay is invalid";
    }
    this.essayRepository.save(essay);
    return "success";
  }
  
  @GetMapping("/findByAuthor")
  @ResponseBody
  @CrossOrigin(origins = "*")
  public List<Essay> findByAuthor(@RequestParam String author) {
    Iterable<Essay> essays = this.essayRepository.findByAuthor(author);
    List<Essay> essayList = new ArrayList<>();
    essays.forEach(essayList::add);
    return essayList;
  }
  

  @GetMapping("/findAllEssays")
  @ResponseBody
  @CrossOrigin(origins = "*")
  public List<Essay> findAllEssays() {
    Iterable<Essay> essays = this.essayRepository.findAll();
    List<Essay> essayList = new ArrayList<>();
    essays.forEach(essayList::add);
    return essayList;
  }

  @PostMapping("/deleteByAuthor")
@CrossOrigin(origins = "*")
public String deleteByAuthor(@RequestParam String author) {
    if (author == null || author.isEmpty()) {
        return "Invalid author";
    }
    essayRepository.deleteByAuthor(author);
    return "Essays by author '" + author + "' have been deleted.";
}
}
