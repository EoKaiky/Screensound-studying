package spring.atividade.screensound.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.atividade.screensound.model.Artista;

public interface ArtistRepository extends JpaRepository<Artista, Long> {

    Optional<Artista> findByNameContainingIgnoreCase(String name);
    
}
