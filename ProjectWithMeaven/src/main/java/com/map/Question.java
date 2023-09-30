package com.map;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Question {
	
	@Id
    @Column(name = "question_id")
	private int questionid;
	private String question;
	
	@OneToOne
	@JoinColumn(name = "a_id")
	private Answer answer;
	
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int questionid, String question) {
		super();
		this.questionid = questionid;
		this.question = question;
	}
	public int getQuestionid() {
		return questionid;
	}
	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
   
	
	
}
