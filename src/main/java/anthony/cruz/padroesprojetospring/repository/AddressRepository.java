package anthony.cruz.padroesprojetospring.repository;

import anthony.cruz.padroesprojetospring.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, String> {
}
