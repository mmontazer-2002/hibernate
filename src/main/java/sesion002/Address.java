package sesion002;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Mahdie Montazeralzohoor on 1/11/2022 7:57 PM
 */
@Data
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
     private String address;



}
