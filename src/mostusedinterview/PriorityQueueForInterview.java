package mostusedinterview;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueForInterview {

    private record MemberPriforInterview(String name, Type type){ }

    public enum Type{
        BRONZE(1),
        SILVER(2),
        GOLD(3),
        PLATINUM(4) ;

        private final int ranking;

        Type(int ranking) {
            this.ranking = ranking;
    }
        public int getRanking() {
            return ranking;
        }

    public static void main(String[] args) {
        PriorityQueue<MemberPriforInterview> pq = new PriorityQueue<>(
                Comparator.comparingInt(e -> e.type.ranking)
        );

        pq.offer(new MemberPriforInterview("kair",Type.BRONZE));
        pq.offer(new MemberPriforInterview("ning",Type.SILVER));
        pq.offer(new MemberPriforInterview("ksell",Type.GOLD));
        pq.offer(new MemberPriforInterview("linter",Type.PLATINUM));

        System.out.println(pq.poll());

        while (!pq.isEmpty()){
            var asepa = pq.poll();
            System.out.println(asepa);
        }
    }
}
}