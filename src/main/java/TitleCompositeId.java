import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * Date: 20/06/2011
 * Time: 19:46
 * To change this template use File | Settings | File Templates.
 */
public class TitleCompositeId implements Serializable {
    private Person person;
    protected Long id;

    public TitleCompositeId(){}

    public TitleCompositeId(Long id, Person person) {
        this.id = id;
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TitleCompositeId that = (TitleCompositeId) o;

        if (!id.equals(that.id)) return false;
        if (person != null ? !person.equals(that.person) : that.person != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = person != null ? person.hashCode() : 0;
        result = 31 * result + id.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "TitleCompositeId{" +
                "person=" + person +
                ", id=" + id +
                '}';
    }
}
