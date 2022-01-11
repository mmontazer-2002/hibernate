package sesion002;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Mahdie Montazeralzohoor on 1/11/2022 7:57 PM
 */
@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String number;

    public Book() {
    }

    public Book(int id, String name, String number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }
}
