import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * Date: 18/06/2011
 * Time: 17:03
 * To change this template use File | Settings | File Templates.
 */
public class TitleId implements Serializable {
    private Long id;
    protected Long personId;

    public TitleId(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TitleId(Long id, Long personId) {
        this.id = id;
        this.personId = personId;
    }

    public TitleId(Long id) {
        this.id = id;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TitleId titleId = (TitleId) o;

        if (id != null ? !id.equals(titleId.id) : titleId.id != null) return false;
        if (personId != null ? !personId.equals(titleId.personId) : titleId.personId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (personId != null ? personId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TitleId{" +
                "id=" + id +
                ", personId=" + personId +
                '}';
    }

}
