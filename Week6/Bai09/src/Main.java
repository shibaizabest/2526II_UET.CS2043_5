public class Main {

    public static void main(String[] args) {
        AudioPlayable myAudio = new AudioPlayer();
        VideoPlayable myVideo = new VideoPlayer();

        MediaPlayer mediaPlayer = new MediaPlayer(myAudio, myVideo);

        mediaPlayer.playAudio("Noi tinh yeu bat dau");
        mediaPlayer.playVideo("MrBeast donate 1$");
    }

}

