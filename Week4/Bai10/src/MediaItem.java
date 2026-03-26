public abstract class MediaItem {
    private String mediaId, mediaName;

    public MediaItem(String mediaId, String mediaName){
        this.mediaId = mediaId;
        this.mediaName = mediaName;
    }

    public String getMediaName() {
        return mediaName;
    }
    public String getMediaId(){
        return mediaId;
    }
}
