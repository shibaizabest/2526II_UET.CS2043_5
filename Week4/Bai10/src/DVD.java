public class DVD extends MediaItem{
    private int duration;
    private String director;

    public DVD(String id, String name, String director, int duration){
        super(id, name);
        this.director = director;
        this.duration = duration;
    }

    @Override
    public String toString(){
        return (getMediaName() + " - " + director + " - " + duration);
    }
}
