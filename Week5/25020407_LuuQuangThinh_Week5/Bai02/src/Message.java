public class Message {
    private String id, content;

    public Message(String id, String content){
        this.id = id;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public String getId() {
        return id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setId(String id) {
        this.id = id;
    }
    @Override
    public String toString(){
        return id +  " - " + content;
    }
}
