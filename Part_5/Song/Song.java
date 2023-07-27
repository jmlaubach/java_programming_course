package Part_5.Song;

public class Song {
    private String band;
    private String song;
    private int duration;

    public Song(String band, String song, int duration) {
        this.band = band;
        this.song = song;
        this.duration = duration;
    }

    public boolean equals(Song compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Song)) {
            return false;
        }

        Song comparedSong = (Song) compared;

        if (this.band.equals(comparedSong.band) &&
            this.song.equals(comparedSong.song) &&
            this.duration == comparedSong.duration) {
            return true;
            }

        return false;
    }
}
