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
            int disposablePrice = Integer.parseInt(tokens.nextToken()) * 100;
            int clothPrice = Integer.parseInt(tokens.nextToken()) * 10;

            if(disposablePrice < clothPrice){
                System.out.println("Disposable");
            }
            else {
                System.out.println("Cloth");
            }
        }
    }
}
