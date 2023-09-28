package media;

import media.*;

public class AudioPlayer extends MultimediaPlayer {
    public static String audio = "audio";

    public AudioPlayer(String mediaName, String type) throws InvalidMediaTypeException {
        super(mediaName, type);

        if (!type.toLowerCase().equals(audio)) {
            throw new InvalidMediaTypeException("Invalid Media");
        }

    }

    public void play() {
        flag = true;
        System.out.println("Playing the mediafile " + mediaName);
    }
}
