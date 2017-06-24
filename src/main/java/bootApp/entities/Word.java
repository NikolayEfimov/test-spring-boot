package bootApp.entities;

import javax.persistence.*;
import java.util.List;

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
    private List<String> meaningList;

    @Column(name = "TRANSCRIPTION")
    private String transcription;


}
