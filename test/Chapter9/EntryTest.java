package Chapter9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {

    @Test
    void testThatEntryCanBeCreated(){
        Entry entry = new Entry("my love","01:01:2022","o faithful day");
        assertNotNull(entry);
    }

    @Test
    void testThatEntryCanGetTitle() {
        Entry entry = new Entry("my love","01:01:2022","o faithful day");
        entry.setTitle("Beautiful Morning");
        assertEquals("Beautiful Morning",entry.getTitle());

    }

    @Test
    void TestThatEntryCanHaveDate() {

        Entry entry = new Entry("my love","01:01:2022","o faithful day");
        entry.setTitle("Beautiful Morning");
        entry.setDate("12:01:2022");
        assertEquals("12:01:2022",entry.getDate());
    }

    @Test
    void TestThatEntryCanGetBody() {

        Entry entry = new Entry("my love","01:01:2022","o faithful day");
        entry.setTitle("Beautiful Morning");
        entry.setDate("12:01:2022");
        entry.setBody("i woke home dis morning blossom");
        assertEquals("i woke home dis morning blossom",entry.getBody());
    }
}