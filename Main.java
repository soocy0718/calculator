/******************************** 
 * v1.0
 * 2023-08-28
*********************************/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        int number1, number2;
        int result = 0;
        String operator = "";


        System.out.print("수식을 입력해주세요: ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        number1 = Integer.parseInt(st.nextToken());
        operator = st.nextToken();
        number2 = Integer.parseInt(st.nextToken());
        switch(operator){
            case "+" : 
                result = add(number1, number2);
                break;
            case "-" :
                result = sub(number1, number2);
                break;
            case "*" :
                result = multi(number1, number2);
                break;
            case "/" :
                result = div(number1, number2);
                break;
        }
        System.out.println("result is " + result + ".");
    }
    public static int add(int number1, int number2)
    {
        return number1 + number2;
    }
    public static int sub(int number1, int number2)
    {
        return number1 - number2;
    }
    
    public static int multi(int number1, int number2)
    {
        return number1 * number2;
    }
    
    public static int div(int number1, int number2)
    {   
        if(number2==0){
            throw new IllegalArgumentException("분모 0으로 나눌 수 없습니다"); 
        }
        return number1 / number2;
    }
}