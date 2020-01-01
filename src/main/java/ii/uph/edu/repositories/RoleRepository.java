package ii.uph.edu.repositories;


import ii.uph.edu.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    Role findRoleByType(Role.Types type);
}
