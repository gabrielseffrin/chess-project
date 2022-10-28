package model.player;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player implements BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idPlayer")
    private long idPlayer;

    @Column(name = "playerName")
    private String player_name;

    @Column(name = "matchesPlayed")
    private int matchesPlayed;

    @Column(name = "winner")
    private int winners;

    public long getId() {
        return idPlayer;
    }
}
