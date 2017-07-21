package util;

import java.io.*;
import java.util.*;
 
public class Main {
    private List<String> readFromFile(String filename) throws IOException{
        File file = new File(filename);
        FileReader in = new FileReader(file);
        BufferedReader br = new BufferedReader(in);
 
        List<String> res= new ArrayList<>();
        String line;
        while (br.readLine()!= null) {
            line = br.readLine();
            String str = new String(line);
            res.add(str);
        }
        in.close();
        return res;
    }
 
    private int[] roomNumber(int N, int M, int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        for (Integer ele : b) {
            set.add(ele);
        }
 
        Arrays.sort(b);
 
        int[] res = new int[N];
        for (int i = 0; i < N; i++) {
            int num = a[i];
            int roomNum = 0;
            while (num > 0) {
                roomNum++;
                if (!set.contains(roomNum)) {
                    num--;
                }
            }
            res[i] = roomNum;
        }
        return res;
    }
 
    public static void main(String args[]) {
        Main obj = new Main();
 
       // int N = 5, M = 5;
        //int[] a = {5, 10, 15, 20, 25};
        //int[] b = {2,4, 6, 8, 10};
        int n, m;
        Scanner sc=new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int [] a = new int[n];
        int [] b = new int[m];
        for (int i = 0; i < n; ++i) {
             a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; ++i) {
             b[i] = sc.nextInt();
        }
        int[] res = obj.roomNumber(n, m, a, b);
        for (Integer ele : res) {
            System.out.println(ele);
        }
    }
}