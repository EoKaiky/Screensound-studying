/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package spring.atividade.screensound.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "musics")
public class Musica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    private String title;

    @ManyToOne
    private Artista artist;

    public Musica(){}
    
    public Musica(String titleMusic){
        this.title = titleMusic;
    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artista getArtist() {
        return artist;
    }

    public void setArtist(Artista artist) {
        this.artist = artist;
    }


    public String toString() {
        return 
               "Música='" + title+ '\'' +
               ", artista=" + artist;
    }
    
}
