package hit.day29;

import java.util.Set;
import java.util.TreeSet;

public class ComparableDemo {
	public static void main(String[] args) {
		ComparableDemo dc=new ComparableDemo();
		Set<Question>qset=dc.getQuestionSet();
		System.out.println(qset);
	}
	public Set<Question> getQuestionSet(){
		Set<Question> quesSet=new TreeSet<Question>((q1,q2)-> {return q1.qid.compareTo(q2.qid);});
		Question q1=new Question("1", "who is cm?", "chiefmember", "chiefminister", "chiefmajor", "1");
		Question q2=new Question("2", "who is pm?", "primemember", "primeminister", "primemajor", "2");
		Question q3=new Question("3", "who is dm?", "districtmember", "districtmajistrate", "districtmajor", "5");
		Question q4=new Question("4", "who is hm?", "headmember", "headmaster", "headmajor", "4");
		Question q5=new Question("5", "who is cm?", "chiefmember", "chiefminister", "chiefmajor", "3");
		quesSet.add(q1);
		quesSet.add(q2);
		quesSet.add(q3);
		quesSet.add(q4);
		quesSet.add(q5);
		return quesSet;
	}

}
class Question implements Comparable<Question>{
	String qid,question,option1,option2,option3,answer;

	public Question(String qid, String question, String option1,String option2, String option3, String answer) {
		this.qid = qid;
		this.question=question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.answer = answer;
	}
	@Override
	public int compareTo(Question o) {
		
		return this.qid.compareTo(qid);
	}
	@Override
	public String toString() {
		return "Question [qid=" + qid + ", question=" + question + ", option1=" + option1 + ", option2=" + option2
				+ ", option3=" + option3 + ", answer=" + answer + "]\n";
	}
	
	
}