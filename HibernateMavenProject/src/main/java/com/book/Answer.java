package com.book;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
	@Id
	@Column(name = "answer_id")
	private int anserId;
	private String answer;
	@ManyToOne
	private Question question;
	
		// TODO Auto-generated constructor stub
	
	public Answer(int anserId, String answer, Question question) {
		super();
		this.anserId = anserId;
		this.answer = answer;
		this.question = question;
	}
	
	public int getAnserId() {
		return anserId;
	}
	public void setAnserId(int anserId) {
		this.anserId = anserId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	@Override
	public String toString() {
		return "Answer [anserId=" + anserId + ", answer=" + answer + ", question=" + question + "]";
	}
	
}
