package sesion002;

import javax.persistence.OneToOne;

/**
 * Created by Mahdie Montazeralzohoor on 1/11/2022 7:57 PM
 */
public class Address {
    @OneToOne
    private String address;
}
