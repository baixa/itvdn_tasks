package org.example.solid.liskov_substitution.mediaplayer_lsp_solution;

import java.util.ArrayList;
import java.util.List;

public class ClientTestProgram {
    public static void main(String[] args) {
        List<VideoMediaPlayer> allPlayers = new ArrayList<>();
        allPlayers.add(new VlcMediaPlayer());
        allPlayers.add(new TorMediaPlayer());

        playVideoInAllMediaPlayers(allPlayers);

        System.out.println("-----------------------------");


        playVideoInAllMediaPlayers(allPlayers);
    }

    private static void playVideoInAllMediaPlayers(List<VideoMediaPlayer> allPlayers) {
        allPlayers.forEach(VideoMediaPlayer::playVideo);
    }
}
