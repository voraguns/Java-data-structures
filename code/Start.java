class Start {
    public static void main(String[] data) {
        Element e; // no default value
        Element f; // no default value
        Element g; // no default value
        
        e = new Element();
        e.name = "Tom";
        e.numnber = 1;
        f = new Element();
        f.name = "Jerry";
        f.numnber = 2;
        g = new Element();
        g.name = "Spike";
        g.numnber = 3;
        
        e.next = f; // link first and second
        f.next = g; // link second and third
        
        for (Element current = e; current != null; current = current.next) {
            System.out.println(current.numnber + " " + current.name);
        }
    }
    
    
}

class Element {
    String name; // null
    int numnber; // 0
    double weight; // 0.0
    Element next; // null
}