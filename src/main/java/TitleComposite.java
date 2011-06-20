/**
 * Created by IntelliJ IDEA.
 * Date: 20/06/2011
 * Time: 19:41
 * To change this template use File | Settings | File Templates.
 */
public class TitleComposite {
    private String name;
    private TitleCompositeId id;

    public TitleComposite() {
    }

    public TitleComposite(String name, TitleCompositeId id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TitleCompositeId getId() {
        return id;
    }

    public void setId(TitleCompositeId id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TitleComposite that = (TitleComposite) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TitleComposite{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
