import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        for(int i = 0; i < n; i++){
            StringTokenizer tokens = new StringTokenizer(reader.readLine());
            int height = Integer.parseInt(tokens.nextToken());
            int minimumHeight = Integer.parseInt(tokens.nextToken());

            if(height < minimumHeight){
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }
    }
}
