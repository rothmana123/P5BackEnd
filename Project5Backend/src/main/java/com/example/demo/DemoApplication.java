package com.example.demo;

import java.util.List;

import com.google.common.collect.Lists;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
@SpringBootApplication
public class DemoApplication {
  @Autowired
  EssayRepository essayRepository;

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  // Essay Methods

  @ShellMethod("Saves an essay to Cloud Datastore: save-essay <author> <text> <feedback> <studentID>")
  public String saveEssay(String author, String text, String feedback, String studentID, String overall, String lead, String transitions, String ending,
  String organization, String overallAssessment,
  int leadScore, int transitionsScore, int endingScore,
  int organizationScore, int overallAssessmentScore) {
    Essay savedEssay = this.essayRepository.save(new Essay(author, text, feedback, studentID, overall, lead, transitions, ending,
     organization, overallAssessment, leadScore, transitionsScore, endingScore,
     organizationScore, overallAssessmentScore));
    return savedEssay.toString();
  }

  @ShellMethod("Loads all essays")
  public String findAllEssays() {
    Iterable<Essay> essays = this.essayRepository.findAll();
    return Lists.newArrayList(essays).toString();
  }

  @ShellMethod("Loads essays by author: find-by-author <author>")
  public String findEssaysByAuthor(String author) {
    List<Essay> essays = this.essayRepository.findByAuthor(author);
    return essays.toString();
  }

  @ShellMethod("Loads essays containing text: find-by-text <text>")
  public String findEssaysByText(String text) {
    List<Essay> essays = this.essayRepository.findByTextContains(text);
    return essays.toString();
  }

  @ShellMethod("Loads essays by author and studentID: find-by-author-studentid <author> <studentID>")
  public String findEssaysByAuthorAndStudentID(String author, String studentID) {
    List<Essay> essays = this.essayRepository.findByAuthorAndStudentID(author, studentID);
    return essays.toString();
  }

  @ShellMethod("Removes all essays")
  public void removeAllEssays() {
    this.essayRepository.deleteAll();
  }
}
