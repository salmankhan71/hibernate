package salman.com;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "oneToOneAswer")

public class Answer {
	@Id
	private int answerId;
	private String answer;
	@ManyToOne
	private Question question;

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
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
		return "Answer [answerId=" + answerId + ", answerString=" + answer+ ", question=" + question + "]";
	}

}
