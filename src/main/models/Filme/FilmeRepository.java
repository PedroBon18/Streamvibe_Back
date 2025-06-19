import org.springframework.data.jpa.repository.JpaRepository;

public class FilmeRepository {
    
    public interface InnerFilmeRepository extends JpaRepository<Filme, interger> {
    
        
    }
}
