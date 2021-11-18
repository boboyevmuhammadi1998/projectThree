package uz.pdp.projectthree.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.projectthree.entity.University;

@Repository
public interface UniversityRepository extends JpaRepository<University, Integer> {
}