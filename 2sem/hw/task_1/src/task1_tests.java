//package task_1_tests;
import org.junit.*;

public class task1_tests extends Assert{

    @Test
    public void createDoubleLinkedList_CreateEmptyDoubleLinkedList_EmptyTrue(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void createDoubleLinkedList_CreateEmptyDoubleLinkedList_EmptyFalse(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(1);
        assertFalse(list.isEmpty());
    }

    @Test
    public void getSize_getSizeFromEmptyDoubleLinkedList_sizeCorrect(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(0 == list.getSize());
    }

    @Test
    public void pushFront_PushFrontDoubleLinkedList_sizeCorrect(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        assertTrue(1 == list.getSize());
    }

    @Test
    public void pushFront_PushFrontEmptyDoubleLinkedList_TryToGetAnotherNumber(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        try {
            list.get(2);
            fail();
        } catch (IndexOutOfBoundsException e){
            assertFalse(false);
        }
    }

    @Test
    public  void getHead_PushFrontEmptyDoubleLinkedList_TryToGetHead(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        int head = ((Node<Integer>)list.getHead()).getData();
        assertEquals(2, head);
    }

    @Test
    public void getHead_PushBackEmptyDoubleLinkedList_TryToGetHead(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(2);
        list.pushBack(1);
        int head = ((Node<Integer>)list.getHead()).getData();
        assertEquals(1, head);
    }

    @Test
    public void getTail_PushFrontEmptyDoubleLinkedList_TryToGetTail(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        int tail = ((Node<Integer>)list.getTail()).getData();
        assertEquals(1, tail);
    }

}
