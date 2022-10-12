
public class MealExample {

	public static void main(String[] args) {
		int meal = 5;
		String mealString;
		switch (meal) {
		case 1:
		    mealString = "breakfast";
		    break;
		case 2:
		    mealString = "second breakfast";
		    break;
		case 3:
		    mealString = "elevenses";
		    break;
		case 4:
		    mealString = "luncheon";
		    break;
		case 5:
		    mealString = "afternoon tea";
		    break;
		case 6:
		    mealString = "dinner";
		    break;
		case 7:
		    mealString = "supper";
		    break;
		default:
		    mealString = "snack";
		}
		System.out.println(mealString);

	}

}
