package anthony.cruz.padroesprojetospring.repository;

import anthony.cruz.padroesprojetospring.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
