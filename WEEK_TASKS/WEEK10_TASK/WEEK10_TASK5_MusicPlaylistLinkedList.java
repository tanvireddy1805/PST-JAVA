import java.util.LinkedList;

public class WEEK10_TASK5_MusicPlaylistLinkedList {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();
        playlist.add("First Light");
        playlist.add("City Lines");
        playlist.add("Quiet Morning");
        playlist.addFirst("Opening Track");
        playlist.addLast("Closing Track");

        System.out.println("Playlist:");
        for (int i = 0; i < playlist.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, playlist.get(i));
        }

        String nowPlaying = playlist.removeFirst();
        System.out.println("Now playing: " + nowPlaying);
        System.out.println("Next track: " + playlist.getFirst());
    }
}
