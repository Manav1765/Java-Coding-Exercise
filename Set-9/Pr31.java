import java.util.LinkedList;

public class Pr31 {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();

        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");

        System.out.println("Playlist: " + playlist);

        System.out.println("Playing: " + playlist.removeFirst());
        System.out.println("After playing first: " + playlist);

        System.out.println("Skipping: " + playlist.removeLast());
        System.out.println("After skipping last: " + playlist);
    }
}