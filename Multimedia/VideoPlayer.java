package media;

import media.*;

public class VideoPlayer extends MultimediaPlayer {
    public static String video = "video";

    public VideoPlayer(String mediaName, String type) throws InvalidMediaTypeException {
        super(mediaName, type);
        if (!type.toLowerCase().equals(video)) {
            throw new InvalidMediaTypeException("Invalid media");
        }
    }

    public void play() {
        flag = true;
        System.out.println("Playing the mediafile " + mediaName);
    }
}
