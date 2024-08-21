package basic5;

public class Ch04_prac {

	public static void main(String[] args) {
		// practice
		
		//4-2  switch -> if
		String grade = "A";
		
		int score1 = 0;
		switch (grade) {
		case "A" :
			score1 = 100;
		case "B" :
			int result = 100 - 20 ;
			score1 = result ;
			break ;
		default :
			score1 = 60;
		}System.out.println("등급은" + grade + "이고, 점수는" + score1+"입니다.");
		
		
		if (grade == "A") {
			score1 = 100;
		//System.out.println("등급은" + grade + "이고, 점수는" + score1+"입니다.");
		} else if (grade == "B") {
			int result = 100-20;
			score1 = result;
			//System.out.println("등급은" + grade + "이고, 점수는" + score1+"입니다.");
		} else {
			score1 = 60;
			//System.out.println("등급은" + grade + "이고, 점수는" + score1+"입니다.");
		}System.out.println("등급은" + grade + "이고, 점수는" + score1+"입니다.");
		
		

	}

}
