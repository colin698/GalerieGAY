package galerie.dao;

import galerie.entity.Galerie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.jdbc.Sql;
import galerie.dao.GalerieRepository;

@Log4j2 // Génère le 'logger' pour afficher les messages de trace
@DataJpaTest
public class ExpositionRepositoryTest {
    @Autowired
    private ExpositionRepository expositionDAO;
    @Autowired
    private GalerieRepository galerieDAO;

    @Test
    @Sql("test-data.sql")
    public void onSaitCompterLeNombreDexpositions(){
        log.info("On compte le nombre d'Exposition enregistrés dans la base de données");
        int combienDansLeTest = 3;
        float compte = expositionDAO.count();
        assertEquals(combienDansLeTest, compte, "On doit trouver 3 expositions enregistrées");
    }

    
}
