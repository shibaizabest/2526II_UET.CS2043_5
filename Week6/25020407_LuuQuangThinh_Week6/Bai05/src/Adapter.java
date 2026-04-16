public class Adapter implements Player{
    private OldPlayer oldPlayer;

    public Adapter(OldPlayer oldPlayer){
        this.oldPlayer = oldPlayer;
    }

    @Override
    public void play(String name) {
        oldPlayer.playFile(name);
    }
}
