public class AudioPlayer implements AudioPlayable{

    @Override
    public void playAudio(String file) {
        System.out.println("Playing Audio: "+ file);
    }
}
