import lombok.Data;
import lombok.AllArgsConstructor;

public class ReverseLinkedList {

    @Data
    @AllArgsConstructor
    public static class Node<T> {
        private T value;
        private Node next;

        @Override
        public String toString() {
            return "Node{v=%s}".formatted(value);
        }

        public static Node reveseLoop(Node head) {

            Node prev = null;
            Node curr = head;

            while (curr != null) {
                Node temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            return prev;
        }

    }

}

