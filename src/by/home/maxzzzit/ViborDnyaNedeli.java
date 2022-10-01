package by.home.maxzzzit;

public class ViborDnyaNedeli {
	public static void main(String[]args) {
		String str = "5325874931";
		for (char perebor : str.toCharArray()) {
			System.out.print(vibor(perebor)+" ");
		}
	}
	static String vibor(char perebor) {
		String s ="";
		switch (perebor) {
		case '1' : s = "Понедельник";
		break;
		case '2' : s = "Вторник";
		break;
		case '3' : s = "Среда";
		break;
		case '4' : s = "Четверг";
		break;
		case '5' : s = "Пятница";
		break;
		case '6' : s = "Суббота";
		break;
		case '7' : s = "Воскресенье";
		break;
		default: System.out.print("Такого дня недели нет");
		break;
		}
		return s;
	}
}