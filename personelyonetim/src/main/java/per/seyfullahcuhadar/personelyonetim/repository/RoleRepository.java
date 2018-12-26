package per.seyfullahcuhadar.personelyonetim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import per.seyfullahcuhadar.personelyonetim.model.Role;
import per.seyfullahcuhadar.personelyonetim.model.RoleName;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}