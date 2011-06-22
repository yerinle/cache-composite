import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * Date: 20/06/2011
 * Time: 07:04
 * To change this template use File | Settings | File Templates.
 */


public class PersonTest {

    public static final String FIRST_NAME = "Joe";
    public static final String LAST_NAME = "Blogs";
    public static final String POSITION = "CEO";

    @Test
    public void savePersonWithTitle() {
    Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx  = session.beginTransaction();

        Person person = new Person(FIRST_NAME, LAST_NAME);
        TitleId titlepk = new TitleId(1l);
        Title title = new Title(titlepk, POSITION);
        person.addTitle(title);
        session.saveOrUpdate(person);
        tx.commit();
        session.close();

        Person savedPerson = validatePerson(person);
        Title savedTitle = savedPerson.getTitles().iterator().next();
        assertEquals(title, savedTitle);
    }

    @Test
    public void savePersonWithTitleComposite() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx  = session.beginTransaction();
        Person person = new Person(FIRST_NAME, LAST_NAME);
        TitleCompositeId titlepk = new TitleCompositeId(1l, person);
        TitleComposite title = new TitleComposite(POSITION, titlepk);
        person.addTitleComposite(title);
        session.saveOrUpdate(person);
        tx.commit();
        session.close();

        Person savedPerson = validatePerson(person);

    }

    private Person validatePerson(Person person) {
        Session session;Transaction tx;
        session = HibernateUtil.openSession();
        tx = session.beginTransaction();
        Person savedPerson = (Person)session.load(Person.class, person.getId());
        assertEquals(FIRST_NAME, savedPerson.getFirstName());
        assertEquals(LAST_NAME, savedPerson.getLastName());
        assertEquals(1, savedPerson.getTitles().size());

        return savedPerson;
    }



}
