import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine()); 
		
		PriorityQueue<Integer> que = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(Math.abs(o1.intValue())==Math.abs(o2.intValue())) { //절댓값이 같으면 원래 값이 더 작은 순서대로 출력
					return Integer.valueOf(o1).compareTo(Integer.valueOf(o2));
				}// 절댓값이 같지 않고 크거나 작으면 절댓값이 작은 순서대로 출력 
				return Integer.valueOf(Math.abs(o1)).compareTo(Integer.valueOf(Math.abs(o2)));
			}
			
		});
		for(int i=0;i<N;i++) {
			int num=Integer.parseInt(br.readLine().trim());
			if(num!=0) {
				que.offer(num);
			}else {
				if(que.isEmpty()) {
					sb.append(0).append("\n");
					continue;
				}else if(!que.isEmpty()) {
					sb.append(que.poll()).append("\n");
					continue;
				}
			}
		}
		System.out.println(sb);
		
	}
		
}


