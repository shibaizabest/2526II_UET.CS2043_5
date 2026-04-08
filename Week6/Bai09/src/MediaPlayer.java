public class MediaPlayer {

    private final AudioPlayable audioSource;
    private final VideoPlayable videoSource;

    public MediaPlayer(AudioPlayable audio, VideoPlayable video){
        this.audioSource = audio;
        this.videoSource = video;
    }

    public void playVideo(String file){
        videoSource.playVideo(file);
    }

    public void playAudio(String file){
        audioSource.playAudio(file);
    }
}
