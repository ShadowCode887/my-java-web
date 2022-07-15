package bg.softuni.battleships.repository;

import bg.softuni.battleships.model.Category;
import bg.softuni.battleships.model.enums.ShipType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(ShipType name);
}
