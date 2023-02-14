package level1;

public class FoodFighter {

    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        for(int i=1; i<food.length; i++) {
            int count = food[i] / 2;
            for(int j=1; j<=count; j++) {
                sb.append(i);
            }
        }
        sb.append(0);
        for(int i=food.length-1; i>=0; i--) {
            int count = food[i] / 2;
            for(int j=1; j<=count; j++) {
                sb.append(i);
            }
        }
        return sb.toString();
    }
}
