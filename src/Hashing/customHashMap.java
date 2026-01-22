/*
 * This class implements a simple custom HashMap
 * using separate chaining technique.
 */

class customHashMap {

    static class Node {
        int key, value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node[] table = new Node[5];

    // Insert key-value pair
    void put(int key, int value) {
        int index = key % table.length;
        Node newNode = new Node(key, value);

        // Insert at bucket
        newNode.next = table[index];
        table[index] = newNode;
    }

    // Get value by key
    int get(int key) {
        int index = key % table.length;
        Node temp = table[index];

        // Traverse bucket
        while (temp != null) {
            if (temp.key == key)
                return temp.value;
            temp = temp.next;
        }
        return -1;
    }

    public static void main(String[] args) {
        customHashMap map = new customHashMap();
        map.put(1, 10);
        map.put(6, 20);

        System.out.println(map.get(6));
    }
}
