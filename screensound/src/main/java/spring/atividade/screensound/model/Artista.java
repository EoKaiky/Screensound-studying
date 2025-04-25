package spring.atividade.screensound.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_artistas")
public class Artista {

    public Artista() {}
    public Artista(String name, TypeArtist type) {
        this.name = name;
        this.type = type;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;

    @Column(unique = true)
    private String name;

    @Enumerated(EnumType.STRING)
    private TypeArtist type;
    
    @OneToMany(mappedBy = "artist", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Musica> musics = new ArrayList<>();

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeArtist getType() {
        return type;
    }

    public void setType(TypeArtist type) {
        this.type = type;
    }

    public List<Musica> getmusics() {
        return musics;
    }

    public void setmusics(List<Musica> musics) {
        this.musics = musics;
    }

    @Override
    public String toString() {
        return
                "Artista='" + name +'\'' +
                ", type=" + type +
                ", musics= " + musics +
                '}';
    }
    
}
