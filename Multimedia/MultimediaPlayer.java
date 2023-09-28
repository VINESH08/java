package media;

import media.MediaFile;
import media.InvalidMediaTypeException;

public class MultimediaPlayer implements MediaFile {
    String mediaName, mediaType;
    boolean flag = false;

    MultimediaPlayer(String mediaName, String mediaType) {

        this.mediaName = mediaName;
        this.mediaType = mediaType;
    }

    @Override
    public void play() {
        flag = true;
        System.out.println("Playing media");

    }

    @Override
    public void pause() {
        flag = false;
        System.out.println("Media Paused");

    }

    @Override
    public void stop() {
        flag = false;
        System.out.println("Media Stoped playing");

    }

}
