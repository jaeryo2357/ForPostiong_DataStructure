package PriorityQueue;

import java.util.PriorityQueue;

public class Blog {

    public static void main(String[] args)
    {
        PriorityQueue<Posts> posts = new PriorityQueue<>();

        posts.add(new Posts("안녕하세요","점냥입니다"));
        posts.add(new Posts("오늘은","우선순위 큐 입니다."));
        posts.add(new Posts("앞으로","잘 부탁드립니다"));

        while (!posts.isEmpty())
        {
            System.out.println(posts.poll());
        }

    }
}
