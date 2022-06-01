package question2;

public class HistoryStudent extends Student{

	int historyMarks;
 	int civicsMarks;
 	
 	
	
	public HistoryStudent(int historyMarks, int civicsMarks) {
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}



	@Override
	public int getPercentage() {
		int total = ((historyMarks + civicsMarks)/200)*100;
		return total;
	}
}
