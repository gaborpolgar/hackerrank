package arraysexercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestTest {

    @Test
    public void kthLargestTest() {
        KthLargest kth = new KthLargest();

        assertEquals(99,kth.kthLargest(new int[]{74, 85, 102, 99, 101, 56, 84},2));
    }
    @Test
    public void kthLargestTest2() {
        KthLargest kth = new KthLargest();
        assertEquals(7,kth.kthLargest(new int[]{1,2,3,4,5,6,7,8,9},2));

    }

    @Test
    public void kthLargestTest3() {
        KthLargest kth = new KthLargest();
        assertEquals(8,kth.kthLargest(new int[]{1,2,3,4,5,6,7,8,9},1));
    }

    @Test
    public void kthLargestTest4() {
        KthLargest kth = new KthLargest();
        assertEquals(9,kth.kthLargest(new int[]{1,2,3,4,5,6,7,8,9},0));

    }
}
