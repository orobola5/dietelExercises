package DataStructure.SinglyLinkedList;

    class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public void addNext(Node<T> node) {
            next = node;
        }

        public Node<T> next() {
            return next;
        }

        public T data() {
            return data;
        }

        public void setNext(Node<T> node) {
            this.next = node;
        }
    }



