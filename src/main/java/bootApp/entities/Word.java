package bootApp.entities;

import javax.persistence.*;
import java.util.Map;

@Entity
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "VALUE")
    private String value;

    @ElementCollection
    @CollectionTable(name = "MEANING")
    @MapKeyColumn(name = "value")
    @Column(name = "example")
    private Map<String, String> meaningMap;

    @Column(name = "TRANSCRIPTION")
    private String transcription;


    @Override
    public String toString() {
        return "Word{" +
                "id=" + id +
                ", value='" + value + '\'' +
                ", meaningMap=" + meaningMap +
                ", transcription='" + transcription + '\'' +
                '}';
    }
}
