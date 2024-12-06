package com.example.demo;

import com.google.cloud.spring.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

@Entity(name = "essay")
public class Essay {
    @Id
    Long id;

    String author;
    String text;
    String feedback;
    String studentID;

    // New data members
    String overall;
    String lead;
    String transitions;
    String ending;
    String organization;
    String overallAssessment;

    int leadScore;
    int transitionsScore;
    int endingScore;
    int organizationScore;
    int overallAssessmentScore;

    public Essay(String author, String text, String feedback, String studentID,
                 String overall, String lead, String transitions, String ending,
                 String organization, String overallAssessment,
                 int leadScore, int transitionsScore, int endingScore,
                 int organizationScore, int overallAssessmentScore) {
        this.author = author;
        this.text = text;
        this.feedback = feedback;
        this.studentID = studentID;
        this.overall = overall;
        this.lead = lead;
        this.transitions = transitions;
        this.ending = ending;
        this.organization = organization;
        this.overallAssessment = overallAssessment;
        this.leadScore = leadScore;
        this.transitionsScore = transitionsScore;
        this.endingScore = endingScore;
        this.organizationScore = organizationScore;
        this.overallAssessmentScore = overallAssessmentScore;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getFeedback() {
        return this.feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getStudentID() {
        return this.studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getOverall() {
        return this.overall;
    }

    public void setOverall(String overall) {
        this.overall = overall;
    }

    public String getLead() {
        return this.lead;
    }

    public void setLead(String lead) {
        this.lead = lead;
    }

    public String getTransitions() {
        return this.transitions;
    }

    public void setTransitions(String transitions) {
        this.transitions = transitions;
    }

    public String getEnding() {
        return this.ending;
    }

    public void setEnding(String ending) {
        this.ending = ending;
    }

    public String getOrganization() {
        return this.organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getOverallAssessment() {
        return this.overallAssessment;
    }

    public void setOverallAssessment(String overallAssessment) {
        this.overallAssessment = overallAssessment;
    }

    public int getLeadScore() {
        return this.leadScore;
    }

    public void setLeadScore(int leadScore) {
        this.leadScore = leadScore;
    }

    public int getTransitionsScore() {
        return this.transitionsScore;
    }

    public void setTransitionsScore(int transitionsScore) {
        this.transitionsScore = transitionsScore;
    }

    public int getEndingScore() {
        return this.endingScore;
    }

    public void setEndingScore(int endingScore) {
        this.endingScore = endingScore;
    }

    public int getOrganizationScore() {
        return this.organizationScore;
    }

    public void setOrganizationScore(int organizationScore) {
        this.organizationScore = organizationScore;
    }

    public int getOverallAssessmentScore() {
        return this.overallAssessmentScore;
    }

    public void setOverallAssessmentScore(int overallAssessmentScore) {
        this.overallAssessmentScore = overallAssessmentScore;
    }

    @Override
    public String toString() {
        return "{" +
            "id:" + this.id +
            ", author:'" + this.author + '\'' +
            ", text:'" + this.text + '\'' +
            ", feedback:'" + this.feedback + '\'' +
            ", studentID:'" + this.studentID + '\'' +
            ", overall:'" + this.overall + '\'' +
            ", lead:'" + this.lead + '\'' +
            ", transitions:'" + this.transitions + '\'' +
            ", ending:'" + this.ending + '\'' +
            ", organization:'" + this.organization + '\'' +
            ", overallAssessment:'" + this.overallAssessment + '\'' +
            ", leadScore:" + this.leadScore +
            ", transitionsScore:" + this.transitionsScore +
            ", endingScore:" + this.endingScore +
            ", organizationScore:" + this.organizationScore +
            ", overallAssessmentScore:" + this.overallAssessmentScore +
            '}';
    }
}
