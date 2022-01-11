package sesion002;

import javax.persistence.*;

/**
 * Created by Mahdie Montazeralzohoor on 1/11/2022 7:56 PM
 */
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToOne
    private Address address;


}
