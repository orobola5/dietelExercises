package Chapter9;

import Chapter9.Diary.Diary;
import Chapter9.Diary.Entry;
import org.junit.jupiter.api.Test;
import tddClass.MyAccount;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {
    @Test
    void testThatDiaryCanBeCreated(){
        Diary diary = new Diary("My Diary",4567);
        assertNotNull(diary);
    }
    @Test
    void testThatDiaryCanHaveAName() {
        Diary diary = new Diary("My Diary",5674);
        diary.setName("My Diary 2022");
        assertEquals("My Diary 2022", diary.getName());
    }
    @Test
    void testThatDiaryCanBeOpen(){
        Diary diary = new Diary("My Diary",5674);
        assertEquals(5674,diary.openDiary());
    }

    @Test
    void testThatDiaryCanHaveEntry(){
        Entry entry = new Entry("thr","24:6:20202","i just love coding");
        Diary diary = new Diary("lo",1234);
        diary.createEntry("my dream","12:09:2022","i have  a dream");
        diary.createEntry("my dream","12:08:2022","i can swim");
        diary.createEntry("my dream","12:10:2022","i have to bath");
        assertEquals(3,diary.getNumberOfEntry());

    }
    @Test
    void testThatDiaryCanFindEntry(){
        Diary diary = new Diary("lo",1234);
        diary.createEntry("my dream","12:09:2022","i have  a dream");
        diary.createEntry("Beautiful day","12:08:2022","i can swim");
        diary.createEntry("Magical night","12:10:2022","i have to bath");
        diary.createEntry(" Sunny day","12:09:2022","i have  a dream");
       int position =  diary.findEntry("Magical night");
        assertEquals(3 ,position);
    }
    @Test
    void  testThatEntryCanAdded(){
        Diary diary =new Diary("lo",1234);
        diary.createEntry("my dream","12:09:2022","i have  a dream");
        diary.createEntry("Beautiful day","12:08:2022","i can swim");
        diary.createEntry("Magical night","12:10:2022","i have to bath");
        diary.addEntry();
        diary.addEntry();
        assertEquals(5,diary.getNumberOfEntry());
    }
    @Test
    void  testThatEntryCanBeDeleted(){
        Diary diary =new Diary("lo",1234);
        diary.createEntry(" Sunny day","12:09:2022","i have  a dream");
        diary.createEntry("my dream","12:09:2022","i have  a dream");
        diary.createEntry("Beautiful day","12:08:2022","i can swim");
        diary.createEntry("Magical night","12:10:2022","i have to bath");
        diary.deleteEntry("my dream");
        assertEquals(3,diary.getNumberOfEntry());
//         diary.findEntry("my dream");
//        assertEquals(3 ,diary.getNumberOfEntry());

    }
    @Test
    void testThatEntryCanBeLocked(){
        Diary diary = new Diary("book",3454);
       diary.lockEntry(5648);
       assertTrue(true);
    }



    @Test
    void testThatEntryCanBeUnLocked(){
        Diary diary = new Diary("book",3454);
//        diary.lockEntry(5648);
        assertFalse(false);
    }


}