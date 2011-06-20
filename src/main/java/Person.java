import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * Date: 18/06/2011
 * Time: 16:59
 * To change this template use File | Settings | File Templates.
 */
public class Person {
    private Long id;
    private String firstName;
    private String lastName;
    private Set<Title> titles = new HashSet<Title>();
    private Set<TitleComposite> titleComposites = new HashSet<TitleComposite>();

    public Person(){}

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Title> getTitles() {
        return titles;
    }

    public void setTitles(Set<Title> titles) {
        this.titles = titles;
    }

    public void addTitle(Title title) {
        getTitles().add(title);
    }

    public Set<TitleComposite> getTitleComposites() {
        return titleComposites;
    }

    public void setTitleComposites(Set<TitleComposite> titleComposites) {
        this.titleComposites = titleComposites;
    }

    public void addTitleComposite(TitleComposite titleComposite) {
        getTitleComposites().add(titleComposite);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!firstName.equals(person.firstName)) return false;
        if (id != null ? !id.equals(person.id) : person.id != null) return false;
        if (!lastName.equals(person.lastName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", titles=" + titles +
                '}';
    }
}
