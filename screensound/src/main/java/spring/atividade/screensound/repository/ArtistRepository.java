package spring.atividade.screensound.repository;

import org.hibernate.engine.jdbc.spi.JdbcWrapper;
import org.springframework.data.jpa.repository.JpaRepository;

import spring.atividade.screensound.model.Artista;

public interface ArtistRepository extends JpaRepository<Artista, Long> {
    
}
