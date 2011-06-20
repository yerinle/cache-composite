/**
 * Created by IntelliJ IDEA.
 * Date: 18/06/2011
 * Time: 17:02
 * To change this template use File | Settings | File Templates.
 */
public class Title {
    private TitleId id;
    private String name;

    public Title(){}

    public Title(TitleId id, String name) {
        this.id = id;
        this.name = name;
    }

    public TitleId getId() {
        return id;
    }

    public void setId(TitleId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Title title = (Title) o;

        if (id != null ? !id.equals(title.id) : title.id != null) return false;
        if (!name.equals(title.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Title{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
