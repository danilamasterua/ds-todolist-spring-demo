package ds.todolist.todolist.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name="task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "s_description", length = 100)
    private String sDescription;

    @Column(name = "f_description", length = 5000)
    private String fDescription;

    @Column(name = "date")
    private LocalDateTime date;

    /**
     * @return long return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return String return the sDescription
     */
    public String getSDescription() {
        return sDescription;
    }

    /**
     * @param sDescription the sDescription to set
     */
    public void setSDescription(String sDescription) {
        this.sDescription = sDescription;
    }

    /**
     * @return String return the fDescription
     */
    public String getFDescription() {
        return fDescription;
    }

    /**
     * @param fDescription the fDescription to set
     */
    public void setFDescription(String fDescription) {
        this.fDescription = fDescription;
    }

    /**
     * @return LocalDateTime return the date
     */
    public LocalDateTime getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(LocalDateTime date) {
        this.date = date;
    }

}
