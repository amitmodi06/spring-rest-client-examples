package amit.springframework.repositories;

import amit.springframework.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * created by KUAM on 6/22/2020
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
