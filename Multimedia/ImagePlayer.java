package media;

import media.*;

public class ImagePlayer extends MultimediaPlayer {
    public static String image = "image";

    public ImagePlayer(String mediaName, String type) throws InvalidMediaTypeException {
        super(mediaName, type);
        if (!type.toLowerCase().equals(image)) {
            throw new InvalidMediaTypeException("Invalid Media");
        }
    }

    public void play() {
        flag = true;
        System.out.println("Playing the mediafile " + mediaName);
    }
}
