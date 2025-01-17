package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Permutation_test {
    private static final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
    // private static int numlength;
    // private static int selectNum;
    private static int nums[];
    private static int result[];
    private static boolean visited[];
    
    public static void main(String[] args) throws IOException {

        output.flush();
        output.close();
        input.close();
    }

    public static void permutation(int n, int r, int depth) throws IOException {
        if(depth == r) {
            for(int i = 0 ; i < r ; i++) {
                output.write(result[i] + " ");
            }
            output.write("\n");
        }

        for(int i = 0 ; i < n ; i++) {
            if(visited[i] != true) {
                visited[i] = true;
                result[depth] = nums[i];
                permutation(n, r, depth + 1);
                visited[i] = false;
            }
        }
    }
}
