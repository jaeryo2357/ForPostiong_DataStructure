package PriorityQueue;

public class Posts implements Comparable<Posts> {

    private String title;
    private String content;


    public Posts(String title,String content)
    {
        this.title= title;
        this.content = content;
    }

    @Override
    public int compareTo(Posts o) {
        int result = o.title.length() - title.length();
        if(result!=0) return result;
        return o.content.length()-content.length();
    }

    @Override
    public String toString() {
        return "제목:" + title +"\n내용:"+content+"\n";
    }
}
