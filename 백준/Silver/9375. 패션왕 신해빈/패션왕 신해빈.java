
import java.io.*;
import java.util.*;
import java.util.stream.Stream;

// 백준
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();	// 테스트 케이스

        while (T --> 0) {

            HashMap<String, Integer> hm = new HashMap<>();	// <종류, 개수>

            int N = in.nextInt();	// 입력받는 옷의 개수

            while (N-- > 0) {

                in.next();	// 옷 이름은 필요 없음

                String kind = in.next();	// 옷 종류

                /**
                 * 해당 종류의 옷이 해시맵에 있을경우
                 * 해시맵에 저장되어있던 해당 종류의 개수를 +1 증가시킨다.
                 *
                 * 해당 종류의 옷이 해시맵에 없을 경우
                 * 해당 종류와 개수 1을 넣는다.
                 */

                if (hm.containsKey(kind)) {
                    hm.put(kind, hm.get(kind) + 1);
                }
                else {
                    hm.put(kind, 1);
                }
            }

            int result = 1;

            /**
             * 안 입는 경우를 고려하여 각 종류별 옷의 개수에 +1 해준 값을
             * 곱해주어야 한다.
             */
            for (int val : hm.values()) {
                result *= (val + 1);
            }

            System.out.println(result - 1);		// 알몸인 상태를 제외해주어야 하므로 최종값에 -1이 정답.

        }

    }

}