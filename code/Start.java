class Start {
    public static void main(String[] data) {
        Element e;
        e = new Element();
        e.name = "Hydrogen";
        e.numnber = 1;
        System.out.println(e);   // Address
        System.out.println(e.name); // Hydrogen
        System.out.println(e.next); // null
        e.next = new Element(); // get another address
        e.next.name = "Helium";
        e.next.numnber = 2;
        for(Element current = e; current != null; current = current.next) {
            System.out.println(current.name + " " + current.numnber);
        }
    }
}

class Element {
    String name; // null
    int numnber;
    double weight;
    Element next;
}