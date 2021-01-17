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
public class PersonneRepositoryTes {
    
    @Autowired
    private GalerieRepository personneDAO;

    @Test
    @Sql("test-data.sql") // On peut charger des donnnées spécifiques pour un test
    public void onSaitCompterLeNombreDePersonnes(){
        log.info("On compte le nombre d'enregistrement de Personne");
        int combienDansLeTest = 2;
        long nombreCompte = personneDAO.count();
        assertEquals(combienDansLeTest, nombreCompte, "Il doit y avoir 2 enregistrements de Personne");
    }
}
