package ii.uph.edu.models;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by grzesiek on 23.08.2017.
 */

@Entity
@Table(name = "roles")

public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.STRING)//przechowywane w postaci string
    private Types type;
    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

    public Role(){}

    public Role(Types type){
        this.type = type;
    }

    public enum Types{
        ROLE_ADMIN,
        ROLE_USER,
        ROLE_WORKER
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Types getType() {
        return type;
    }

    public void setType(Types type) {
        this.type = type;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
