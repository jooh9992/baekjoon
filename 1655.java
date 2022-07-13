import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());//정수의 개수
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> minHeap = new PriorityQueue<>((o1, o2) -> o1 - o2);//오름차순
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);//내림차순

        for(int i = 0 ; i < n; i++){
            int num = Integer.parseInt(br.readLine()); //정수 값을 입력

            if(minHeap.size() == maxHeap.size()) maxHeap.offer(num);
            //두개의 힙 크기가 같으면 max에 넣고 아니라면 min에 저장
            else minHeap.offer(num);

            if(!minHeap.isEmpty() && !maxHeap.isEmpty())
            	//만약 min이 비어있지 않고 max가 비어있지 않으면
                if(minHeap.peek() < maxHeap.peek()){
                	//min, max 힙 값을 비교
                    int tmp = minHeap.poll();
                    //min힙에 있는 값을 tmp에 저장
                    minHeap.offer(maxHeap.poll());//min과 max힙 변경
                    maxHeap.offer(tmp);
                }

            sb.append(maxHeap.peek() + "\n"); //peek():큐 다음 출력 값 출력
        }
        System.out.println(sb);
    }
}
