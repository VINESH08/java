package media;

import media.*;
import java.util.Scanner;

public class MainMulti {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the media type");
        String media = in.next();
        System.out.println("1.Audio,2.Video,3.Image");
        int choice = in.nextInt();
        try {

            if (choice == 1) {
                AudioPlayer Audio = new AudioPlayer("songs.mp3", media);
                Audio.play();
                Audio.pause();
                Audio.stop();
            } else if (choice == 2) {

                VideoPlayer Video = new VideoPlayer("Video.mp4", media);
                Video.play();
                Video.pause();
                Video.stop();
            } else if (choice == 3) {

                ImagePlayer Image = new ImagePlayer("Image.jpged", media);
                Image.play();
                Image.pause();
                Image.stop();
            } else {
                System.out.println("Enter correct number");
            }

        } catch (InvalidMediaTypeException e) {
            System.out.println(e);
        }
    }
}
