package level0;

public class RockScissorsPaper {

    public static void main(String[] args) {
        String rsp = "205";
        System.out.println(solution(rsp));
    }

    private static String solution(String rsp) {
        String[] arr = rsp.split("");

        StringBuilder sb = new StringBuilder();

        for(String ele : arr) {
            if(ele.equals("2")) {
                sb.append("0");
            } else if(ele.equals("0")) {
                sb.append("5");
            } else if(ele.equals("5")) {
                sb.append("2");
            }
        }
        return sb.toString();
    }
}
