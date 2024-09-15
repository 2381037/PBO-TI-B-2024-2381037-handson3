package handson2;

public class ForEach {
    public static void main(String[] args) {
        String[] num = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
        for (String numstring : num) {
            int numint = Integer.parseInt(numstring);
            if (numint % 2 == 0){
                System.out.println(numint);
            }
        }
    }
}