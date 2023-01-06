package org.example.solid.liskov_substitution.mediaplayer_lsp_violation;

public class WinampMediaPlayer extends MediaPlayer {

    @Override
    public void playVideo() throws VideoUnsupportedException {
        throw new VideoUnsupportedException();
    }
}
